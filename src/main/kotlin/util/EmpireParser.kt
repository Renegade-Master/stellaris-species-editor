/*
 * MIT License
 *
 * Copyright (c) 2021 Ciaran Bent
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package util

import util.empire.Species
import util.empire.UserEmpire

class EmpireParser {
    private lateinit var it: ListIterator<String>

    fun parseEmpire(userEmpireString: String): ArrayList<UserEmpire> {
        val userEmpireList: ArrayList<UserEmpire> = arrayListOf()
        it = userEmpireString.lines().listIterator()

        // Read the file until the end
        while (it.hasNext()) {
            var currLine = it.safeNext()

            // Attempt to process a single Species
            if (currLine.startsWith('\"')) {
                var userEmpire: UserEmpire = UserEmpire(currLine.removeSurrounding("\""))
                it.safeNext() // Skip the opening brace

                // Get the Species Key
                currLine = it.safeNext()
                if (currLine.startsWith("key=")) {
                    userEmpire.speciesKey = currLine.substringAfter("key=").removeSurrounding("\"")
                }

                // Get the Ship Prefix
                currLine = it.safeNext()
                if (currLine.startsWith("\tship_prefix=")) {
                    userEmpire.shipPrefix = currLine.substringAfter("ship_prefix=").removeSurrounding("\"")
                }

                // Get the Primary Species
                currLine = it.safeNext()
                if (currLine.startsWith("\tspecies={")) {
                    userEmpire = parseSpecies(userEmpire)

                    while (!currLine.startsWith("\tsecondary_species={") && !currLine.startsWith("\tname=")) {
                        currLine = it.safeNext()
                    }

                    it.previous()
                }

                // Get the Secondary Species
                currLine = it.safeNext()
                if (currLine.startsWith("\tsecondary_species={")) {
                    userEmpire = parseSpecies(userEmpire, isPrimary = false)
                } else {
                    it.previous()
                }

                // Get the User Empire Name
                currLine = it.safeNext()
                if (currLine.startsWith("\tname=")) {
                    userEmpire.name = currLine.substringAfter("name=").removeSurrounding("\"")
                }

                // Get the User Empire Adjective
                currLine = it.safeNext()
                if (currLine.startsWith("\tadjective=")) {
                    userEmpire.adjective = currLine.substringAfter("adjective=").removeSurrounding("\"")
                }

                // Get the User Empire Authority
                currLine = it.safeNext()
                if (currLine.startsWith("\tauthority=")) {
                    userEmpire.authority = UserEmpire.Authority.valueOf(
                        currLine.substringAfter("authority=").toUpperCase().removeSurrounding("\"")
                    )
                }

                // Get the User Empire Government
                currLine = it.safeNext()
                if (currLine.startsWith("\tgovernment=")) {
                    userEmpire.government = UserEmpire.Government.valueOf(
                        currLine.substringAfter("government=").toUpperCase().removeSurrounding("\"")
                    )
                }

                // Get the User Empire Advisor Voice
                currLine = it.safeNext()
                if (currLine.startsWith("\tadvisor_voice_type=")) {
                    userEmpire.advisorVoice = UserEmpire.AdvisorVoice.valueOf(
                        currLine.substringAfter("advisor_voice_type=").toUpperCase().removeSurrounding("\"")
                    )
                } else {
                    it.previous()
                }

                // Get the Species Planet Name
                currLine = it.safeNext()
                if (currLine.startsWith("\tplanet_name=")) {
                    userEmpire.planetName = currLine.substringAfter("planet_name=").removeSurrounding("\"")
                }

                // Get the User Empire Planet Class
                currLine = it.safeNext()
                if (currLine.startsWith("\tplanet_class=")) {
                    userEmpire.planetClass = UserEmpire.PlanetClass.valueOf(
                        currLine.substringAfter("planet_class=").toUpperCase().removeSurrounding("\"")
                    )
                }

                // Get the Species System Name
                currLine = it.safeNext()
                if (currLine.startsWith("\tsystem_name=")) {
                    userEmpire.systemName = currLine.substringAfter("system_name=").removeSurrounding("\"")
                }

                // TODO: initializer
                // TODO: graphical_culture
                // TODO: city_graphical_culture
                // TODO: empire_flag
                // TODO: ruler
                // TODO: spawn_as_fallen
                // TODO: ignore_portrait_duplication
                // TODO: room
                // TODO: spawn_enabled
                // TODO: ethic
                // TODO: civics
                // TODO: origin

                userEmpireList.add(userEmpire)
            }
        }

        return userEmpireList
    }

    /**
     * Returns the next line that is not a problematic line.
     * Examples of problematic lines:
     *   - Line Separator
     *
     * @return: String next "good" List<String> Item
     */
    private fun ListIterator<String>.safeNext(): String {
        if (this.next() == System.lineSeparator()) {
            this.safeNext()
        } else
            this.previous()
        return this.next()
    }

    private fun parseSpecies(ue: UserEmpire, isPrimary: Boolean = true): UserEmpire {
        // Get the Species Class
        var currLine = it.safeNext()
        val species: Species = if (isPrimary) {
            ue.primarySpecies
        } else {
            ue.secondarySpecies
        }

        if (currLine.startsWith("\t\tclass=")) {
            species.speciesClass = currLine.substringAfter("class=").removeSurrounding("\"")
        }

        // Get the Species Portrait
        currLine = it.safeNext()
        if (currLine.startsWith("\t\tportrait=")) {
            species.portrait = currLine.substringAfter("portrait=").removeSurrounding("\"")
        }

        // Get the Species Name
        currLine = it.safeNext()
        if (currLine.startsWith("\t\tname=")) {
            species.name = currLine.substringAfter("name=").removeSurrounding("\"")
        }

        // Get the Species Plural
        currLine = it.safeNext()
        if (currLine.startsWith("\t\tplural=")) {
            species.plural = currLine.substringAfter("plural=").removeSurrounding("\"")
        }

        // Get the Species Adjective
        currLine = it.safeNext()
        if (currLine.startsWith("\t\tadjective=")) {
            species.adjective = currLine.substringAfter("adjective=").removeSurrounding("\"")
        }

        // Get the Species Bio
        currLine = it.safeNext()
        if (currLine.startsWith("\t\tspecies_bio=")) {
            species.speciesBio =
                currLine.substringAfter("species_bio=").removeSurrounding("\"")

            while (!currLine.endsWith('"')) {
                currLine = it.safeNext()
                species.speciesBio +=
                    currLine.substringAfter("species_bio=").removeSurrounding("\"")
            }
        }

        // Get the Species Name List
        currLine = it.safeNext()
        if (currLine.startsWith("\t\tname_list=")) {
            species.nameList = currLine.substringAfter("name_list=").removeSurrounding("\"")
        }

        // Get the Species Traits
        currLine = it.safeNext()
        while (currLine.startsWith("\t\ttrait=")) {
            species.traits.add(currLine.substringAfter("trait=").removeSurrounding("\""))
            currLine = it.safeNext()
        }

        if (isPrimary) {
            ue.primarySpecies = species
        } else {
            ue.secondarySpecies = species
        }

        return ue
    }
}
