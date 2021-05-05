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

data class UserEmpire(val speciesKey: String) {
    val shipPrefix: String = ""
    val species: Species = Species("DEFAULT")
    val name: String = ""
    val adjective: String = ""
    val authority: Authority = Authority.Default
    val government: Government = Government.Default
    val planetName: String = ""
    val planetClass: PlanetClass = PlanetClass.Default
    val systemName: String = ""
    val initialiser: Initialiser = Initialiser.Default
    val graphicalCulture: GraphicalCulture = GraphicalCulture.Default
    val cityGraphicalCulture: CityGraphicalCulture = CityGraphicalCulture.Default
    val empireFlag: EmpireFlag = EmpireFlag("DEFAULT")
    val ruler: Ruler = Ruler("DEFAULT")
    val spawnAsFallen: Boolean = false
    val ignorePortraitDuplication: Boolean = false
    val room: Room = Room.Default
    val spawnEnabled: Boolean = false
    val ethic: Ethic = Ethic.Default
    val civics: Array<Civic> = arrayOf<Civic>()
    val origin: Origin = Origin.Default


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

        Default("none_selected")

        // TODO("Requires completion.  Refer to: [https://stellaris.paradoxwikis.com/Government#Government_Type]")
    }

    /**
     * Planet Class is the Planet-type of the starting planet.
     */
    enum class PlanetClass(val repr: String) {
        PC_CONTINENTAL("pc_continental") {
            override fun toString(): String {
                return "Continental"
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
}
