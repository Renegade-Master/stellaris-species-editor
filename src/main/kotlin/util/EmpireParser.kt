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

import util.empire.UserEmpire

fun empireParser(userEmpireString: String): ArrayList<UserEmpire> {
    val userEmpireList: ArrayList<UserEmpire> = arrayListOf()
    val it = userEmpireString.lines().listIterator()

    // Read the file until the end
    while (it.hasNext()) {
        var currLine = it.next()

        // Attempt to process a single Species
        if (currLine.startsWith('\"')) {
            val userEmpire: UserEmpire = UserEmpire(currLine.removeSurrounding("\""))
            it.next() // Skip the opening brace

            // Get the Species Key
            currLine = it.next()
            if (currLine.startsWith("key=")) {
                userEmpire.speciesKey = currLine.substringAfter("key=").removeSurrounding("\"")
            }

            // Get the Ship Prefix
            currLine = it.next()
            if (currLine.startsWith("\tship_prefix=")) {
                userEmpire.shipPrefix = currLine.substringAfter("ship_prefix=").removeSurrounding("\"")
            }

            // Get the Primary Species
            currLine = it.next()
            if (currLine.startsWith("\tspecies={")) {
                // Get the Species Class
                currLine = it.next()
                if (currLine.startsWith("\t\tclass=")) {
                    userEmpire.primarySpecies.speciesClass = currLine.substringAfter("class=").removeSurrounding("\"")
                }

                // Get the Species Portrait
                currLine = it.next()
                if (currLine.startsWith("\t\tportrait=")) {
                    userEmpire.primarySpecies.portrait = currLine.substringAfter("portrait=").removeSurrounding("\"")
                }

                // Get the Species Name
                currLine = it.next()
                if (currLine.startsWith("\t\tname=")) {
                    userEmpire.primarySpecies.name = currLine.substringAfter("name=").removeSurrounding("\"")
                }

                // Get the Species Plural
                currLine = it.next()
                if (currLine.startsWith("\t\tplural=")) {
                    userEmpire.primarySpecies.plural = currLine.substringAfter("plural=").removeSurrounding("\"")
                }

                // Get the Species Adjective
                currLine = it.next()
                if (currLine.startsWith("\t\tadjective=")) {
                    userEmpire.primarySpecies.adjective = currLine.substringAfter("adjective=").removeSurrounding("\"")
                }

                // Get the Species Bio
                currLine = it.next()
                if (currLine.startsWith("\t\tspecies_bio=")) {
                    userEmpire.primarySpecies.speciesBio =
                        currLine.substringAfter("species_bio=").removeSurrounding("\"")
                }

                // Get the Species Name List
                currLine = it.next()
                if (currLine.startsWith("\t\tname_list=")) {
                    userEmpire.primarySpecies.nameList = currLine.substringAfter("name_list=").removeSurrounding("\"")
                }

                // Get the Species Traits
                currLine = it.next()
                while (currLine.startsWith("\t\ttrait=")) {
                    userEmpire.primarySpecies.traits.add(currLine.substringAfter("trait=").removeSurrounding("\""))
                    currLine = it.next()
                }
            }

            // Get the User Empire Name
            currLine = it.next()
            if (currLine.startsWith("\tname=")) {
                userEmpire.name = currLine.substringAfter("name=").removeSurrounding("\"")
            }

            // Get the User Empire Adjective
            currLine = it.next()
            if (currLine.startsWith("\tadjective=")) {
                userEmpire.adjective = currLine.substringAfter("adjective=").removeSurrounding("\"")
            }

            // Get the User Empire Authority
            currLine = it.next()
            if (currLine.startsWith("\tauthority=")) {
                 userEmpire.authority = UserEmpire.Authority.valueOf(currLine.substringAfter("authority=").toUpperCase().removeSurrounding("\""))
            }

            // Get the User Empire Government
            currLine = it.next()
            if (currLine.startsWith("\tgovernment=")) {
                userEmpire.government = UserEmpire.Government.valueOf(currLine.substringAfter("government=").toUpperCase().removeSurrounding("\""))
            }

            // Get the Species Planet Name
            currLine = it.next()
            if (currLine.startsWith("\tplanet_name=")) {
                userEmpire.planetName = currLine.substringAfter("planet_name=").removeSurrounding("\"")
            }

            // Get the User Empire Planet Class
            currLine = it.next()
            if (currLine.startsWith("\tplanet_class=")) {
                userEmpire.planetClass = UserEmpire.PlanetClass.valueOf(currLine.substringAfter("planet_class=").toUpperCase().removeSurrounding("\""))
            }

            // Get the Species System Name
            currLine = it.next()
            if (currLine.startsWith("\tsystem_name=")) {
                userEmpire.systemName = currLine.substringAfter("system_name=").removeSurrounding("\"")
            }

            userEmpireList.add(userEmpire)
        }
    }

    return userEmpireList
}
