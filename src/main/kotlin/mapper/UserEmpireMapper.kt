package mapper

import dao.empire.Species
import dao.empire.UserEmpire
import mu.KotlinLogging
import util.EmpireParser
import java.util.Locale


class UserEmpireMapper : EmpireParser {
    private val logger = KotlinLogging.logger {}
    private lateinit var it: ListIterator<String>

    override fun parseEmpire(userEmpireString: String): ArrayList<UserEmpire> {
        val userEmpireList: ArrayList<UserEmpire> = arrayListOf()
        it = userEmpireString.lines().listIterator()

        // Read the file until the end
        while (it.hasNext()) {
            var currLine = it.safeNext()
            var userEmpire: UserEmpire

            // Attempt to process a single Species
            if (currLine.startsWith('\"')) {
                userEmpire = UserEmpire(currLine.removeSurrounding("\""))
                it.safeNext() // Skip the opening brace

                // Get the Species Key
                currLine = it.safeNext()
                userEmpire.speciesKey = tryGetSimpleValue(currLine, "key=")

                // Get the Ship Prefix
                currLine = it.safeNext()
                userEmpire.shipPrefix = tryGetSimpleValue(currLine, "ship_prefix")

                // Get the Primary Species
                currLine = it.safeNext()
                if (currLine.startsWith("species={")) {
                    userEmpire = parseSpecies(userEmpire)

                    while (!currLine.startsWith("secondary_species={") && !currLine.startsWith("name=")) {
                        currLine = it.safeNext()
                    }

                    it.previous()
                }

                // Get the Secondary Species
                currLine = it.safeNext()
                if (currLine.startsWith("secondary_species={")) {
                    userEmpire = parseSpecies(userEmpire, isPrimary = false)
                } else {
                    it.previous()
                }

                // Get the User Empire Name
                currLine = it.safeNext()
                userEmpire.name = tryGetSimpleValue(currLine, "name=")

                // Get the User Empire Adjective
                currLine = it.safeNext()
                userEmpire.adjective = tryGetSimpleValue(currLine, "adjective=")

                // Get the User Empire Authority
                currLine = it.safeNext()
                if (currLine.startsWith("authority=")) {
                    userEmpire.authority = UserEmpire.Authority.valueOf(
                        currLine.substringAfter("authority=").uppercase(Locale.getDefault()).removeSurrounding("\"")
                    )
                }

                // Get the User Empire Government
                currLine = it.safeNext()
                if (currLine.startsWith("government=")) {
                    userEmpire.government = UserEmpire.Government.valueOf(
                        currLine.substringAfter("government=").uppercase(Locale.getDefault())
                            .removeSurrounding("\"")
                    )
                }

                // Get the User Empire Advisor Voice
                currLine = it.safeNext()
                if (currLine.startsWith("advisor_voice_type=")) {
                    userEmpire.advisorVoice = UserEmpire.AdvisorVoice.valueOf(
                        currLine.substringAfter("advisor_voice_type=").uppercase(Locale.getDefault())
                            .removeSurrounding("\"")
                    )
                } else {
                    it.previous()
                }

                // Get the Species Planet Name
                currLine = it.safeNext()
                userEmpire.planetName = tryGetSimpleValue(currLine, "planet_name=")

                // Get the User Empire Planet Class
                currLine = it.safeNext()
                if (currLine.startsWith("planet_class=")) {
                    userEmpire.planetClass = UserEmpire.PlanetClass.valueOf(
                        currLine.substringAfter("planet_class=").uppercase(Locale.getDefault())
                            .removeSurrounding("\"")
                    )
                }

                // Get the Species System Name
                currLine = it.safeNext()
                userEmpire.systemName = tryGetSimpleValue(currLine, "system_name=")

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

    private fun tryGetSimpleValue(currLine: String, prefix: String): String {
        if (currLine.contains(prefix)) {
            logger.debug { "Found simple value: ${currLine.substringAfter(prefix)}" }
            return currLine.substringAfter(prefix).removeSurrounding("\"")
        }

        return ""
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
            logger.debug { "Found Line Separator" }
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

        if (currLine.startsWith("class=")) {
            species.speciesClass = currLine.substringAfter("class=").removeSurrounding("\"")
        }

        // Get the Species Portrait
        currLine = it.safeNext()
        if (currLine.startsWith("portrait=")) {
            species.portrait = currLine.substringAfter("portrait=").removeSurrounding("\"")
        }

        // Get the Species Name
        currLine = it.safeNext()
        if (currLine.startsWith("name=")) {
            species.name = currLine.substringAfter("name=").removeSurrounding("\"")
        }

        // Get the Species Plural
        currLine = it.safeNext()
        if (currLine.startsWith("plural=")) {
            species.plural = currLine.substringAfter("plural=").removeSurrounding("\"")
        }

        // Get the Species Adjective
        currLine = it.safeNext()
        if (currLine.startsWith("adjective=")) {
            species.adjective = currLine.substringAfter("adjective=").removeSurrounding("\"")
        }

        // Get the Species Bio
        currLine = it.safeNext()
        if (currLine.startsWith("species_bio=")) {
            species.biography =
                currLine.substringAfter("species_bio=").removeSurrounding("\"")

            while (!currLine.endsWith('"')) {
                currLine = it.safeNext()
                species.biography += "\n" +
                        currLine.substringAfter("species_bio=").removeSurrounding("\"")
            }
        }

        // Get the Species Name List
        currLine = it.safeNext()
        if (currLine.startsWith("name_list=")) {
            species.nameList = currLine.substringAfter("name_list=").removeSurrounding("\"")
        }

        // Get the Species Traits
        currLine = it.safeNext()
        while (currLine.startsWith("trait=")) {
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
