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

package util.empire

data class UserEmpire(var speciesKey: String) {
    var shipPrefix: String = ""
    var primarySpecies: Species = Species("DEFAULT")
    var secondarySpecies: Species? = null
    var name: String = ""
    var adjective: String = ""
    var authority: Authority = Authority.Default
    var government: Government = Government.Default
    var planetName: String = ""
    var planetClass: PlanetClass = PlanetClass.Default
    var systemName: String = ""
    var initialiser: Initialiser = Initialiser.Default
    var graphicalCulture: GraphicalCulture = GraphicalCulture.Default
    var cityGraphicalCulture: CityGraphicalCulture = CityGraphicalCulture.Default
    var empireFlag: EmpireFlag = EmpireFlag("DEFAULT")
    var ruler: Ruler = Ruler("DEFAULT")
    var spawnAsFallen: Boolean = false
    var ignorePortraitDuplication: Boolean = false
    var room: Room = Room.Default
    var spawnEnabled: Boolean = false
    var ethic: Ethic = Ethic.Default
    var civics: MutableList<Civic> = mutableListOf<Civic>()
    var origin: Origin = Origin.Default


    /**
     * An empire's authority determines how power is transferred in the
     * government.
     */
    enum class Authority(val repr: String) {
        AUTH_DEMOCRATIC("auth_democratic") {
            override fun toString(): String {
                return "Democratic"
            }
        },

        AUTH_OLIGARCHIC("auth_oligarchic") {
            override fun toString(): String {
                return "Oligarchic"
            }
        },

        AUTH_DICTATORIAL("auth_dictatorial") {
            override fun toString(): String {
                return "Dictatorial"
            }
        },

        AUTH_IMPERIAL("auth_imperial") {
            override fun toString(): String {
                return "Imperial"
            }
        },

        AUTH_HIVE_MIND("auth_hive_mind") {
            override fun toString(): String {
                return "Hive Mind"
            }
        },

        AUTH_MACHINE_INTELLIGENCE("auth_machine_intelligence") {
            override fun toString(): String {
                return "Machine Intelligence"
            }
        },

        AUTH_CORPORATE("auth_corporate") {
            override fun toString(): String {
                return "Corporate"
            }
        },

        Default("none_selected")
    }

    /**
     * Governments define the default Ruler Titles, the first AI message when
     * establishing communications, and also which Leader classes will have an
     * increased weight to be drawn during Oligarchic Elections.
     */
    enum class Government(val repr: String) {
        GOV_MACHINE_INDUSTRIAL("gov_machine_industrial") {
            override fun toString(): String {
                return "Machine Industrial"
            }
        },

        GOV_MACHINE_RESEARCH("gov_machine_research") {
            override fun toString(): String {
                return "Machine Research"
            }
        },

        GOV_MACHINE_EMPIRE("gov_machine_empire") {
            override fun toString(): String {
                return "Machine Empire"
            }
        },

        GOV_HIVE_MIND("gov_hive_mind") {
            override fun toString(): String {
                return "Hive Mind"
            }
        },

        GOV_CITIZEN_REPUBLIC("gov_citizen_republic") {
            override fun toString(): String {
                return "Citizen Republic"
            }
        },

        GOV_REPRESENTATIVE_DEMOCRACY("gov_representative_democracy") {
            override fun toString(): String {
                return "Representative Democracy"
            }
        },

        GOV_IRENIC_MONARCHY("gov_irenic_monarchy") {
            override fun toString(): String {
                return "Irenic Monarchy"
            }
        },

        GOV_EXECUTIVE_COMMITTEE("gov_executive_committee") {
            override fun toString(): String {
                return "Executive Committee"
            }
        },

        GOV_MILITARY_COMMISSARIAT("gov_military_commissariat") {
            override fun toString(): String {
                return "Military Commissariat"
            }
        },

        GOV_MARTIAL_EMPIRE("gov_martial_empire") {
            override fun toString(): String {
                return "Martial Empire"
            }
        },

        GOV_STAR_EMPIRE("gov_star_empire") {
            override fun toString(): String {
                return "Star Empire"
            }
        },

        GOV_BANDIT_KINGDOM("gov_bandit_kingdom") {
            override fun toString(): String {
                return "Bandit Kingdom"
            }
        },

        GOV_CRIMINAL_SYNDICATE("gov_criminal_syndicate") {
            override fun toString(): String {
                return "Criminal Syndicate"
            }
        },

        GOV_TRADE_LEAGUE("gov_trade_league") {
            override fun toString(): String {
                return "Trade League"
            }
        },

        GOV_MEGACORPORATION("gov_megacorporation") {
            override fun toString(): String {
                return "Megacorporation"
            }
        },

        Default("none_selected")

        // TODO("Requires completion.  Refer to: [https://stellaris.paradoxwikis.com/Government#Government_Type]")
    }

    /**
     * Planet Class is the Planet-type of the starting planet.
     */
    enum class PlanetClass(val repr: String) {
        PC_MACHINE("pc_machine") {
            override fun toString(): String {
                return "Machine"
            }
        },

        PC_CONTINENTAL("pc_continental") {
            override fun toString(): String {
                return "Continental"
            }
        },

        PC_ARID("pc_arid") {
            override fun toString(): String {
                return "Arid"
            }
        },

        PC_SAVANNAH("pc_savannah") {
            override fun toString(): String {
                return "Savannah"
            }
        },

        PC_TROPICAL("pc_tropical") {
            override fun toString(): String {
                return "Tropical"
            }
        },

        Default("none_selected")

        // TODO("Requires completion.  Refer to: [https://stellariscommands.com/planet-classes/planet-classes-76yryr6-1]")
    }

    /**
     *
     */
    enum class Initialiser(val repr: String) {
        Default("none_selected")

        // TODO("Requires completion.  Refer to: []")
    }

    /**
     *
     */
    enum class GraphicalCulture(val repr: String) {
        Default("none_selected")

        // TODO("Requires completion.  Refer to: []")
    }

    /**
     *
     */
    enum class CityGraphicalCulture(val repr: String) {
        Default("none_selected")

        // TODO("Requires completion.  Refer to: []")
    }

    /**
     * Room determines the ruler's room in their Empire card.
     */
    enum class Room(val repr: String) {
        Default("none_selected")

        // TODO("Requires completion.  Refer to: []")
    }

    /**
     * Ethics are the guiding principles of an empire and its people and
     * determine an empire or pop's favored courses of action and responses to
     * situations.
     */
    enum class Ethic(val repr: String) {
        Default("none_selected")

        // TODO("Requires completion.  Refer to: []")
    }

    /**
     *
     */
    enum class Civic(val repr: String) {
        Default("none_selected")

        // TODO("Requires completion.  Refer to: []")
    }

    /**
     * The Origin represents the background of a species before it unified
     * itself into an empire.
     */
    enum class Origin(val repr: String) {
        ORIGIN_DEFAULT("origin_default") {
            override fun toString(): String {
                return "Default"
            }
        },

        Default("none_selected")

        // TODO("Requires completion.  Refer to: []")
    }

    override fun toString(): String {
        return "UserEmpire:\n" +
                "    speciesKey='$speciesKey'\n " +
                "    shipPrefix='$shipPrefix'\n " +
                "    primarySpecies=\n    $primarySpecies\n " +
                "    secondarySpecies=\n    $secondarySpecies\n " +
                "    name='$name'\n " +
                "    adjective='$adjective'\n " +
                "    authority=$authority\n " +
                "    government=$government\n " +
                "    planetName='$planetName'\n " +
                "    planetClass=$planetClass\n " +
                "    systemName='$systemName'\n " +
                "    initialiser=$initialiser\n " +
                "    graphicalCulture=$graphicalCulture\n " +
                "    cityGraphicalCulture=$cityGraphicalCulture\n " +
                "    empireFlag=$empireFlag\n " +
                "    ruler=$ruler\n " +
                "    spawnAsFallen=$spawnAsFallen\n " +
                "    ignorePortraitDuplication=$ignorePortraitDuplication\n " +
                "    room=$room\n " +
                "    spawnEnabled=$spawnEnabled\n " +
                "    ethic=$ethic\n " +
                "    civics=${civics}\n " +
                "    origin=$origin\n\n"
    }
}
