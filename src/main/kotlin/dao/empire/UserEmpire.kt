
package dao.empire

data class UserEmpire(var speciesKey: String) {
    var shipPrefix: String = ""
    var primarySpecies: Species = Species("DEFAULT")
    var secondarySpecies: Species = Species("DEFAULT")
    var name: String = ""
    var adjective: String = ""
    var authority: Authority = Authority.Default
    var government: Government = Government.Default
    var advisorVoice: AdvisorVoice = AdvisorVoice.Default
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
    var ethic: MutableList<Ethic> = mutableListOf<Ethic>()
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
        GOV_BANDIT_KINGDOM("gov_bandit_kingdom") {
            override fun toString(): String {
                return "Bandit Kingdom"
            }
        },

        GOV_CITIZEN_REPUBLIC("gov_citizen_republic") {
            override fun toString(): String {
                return "Citizen Republic"
            }
        },

        GOV_CRIMINAL_SYNDICATE("gov_criminal_syndicate") {
            override fun toString(): String {
                return "Criminal Syndicate"
            }
        },

        GOV_DESPOTIC_HEGEMONY("gov_despotic_hegemony") {
            override fun toString(): String {
                return "Despotic Hegemony"
            }
        },

        GOV_EXECUTIVE_COMMITTEE("gov_executive_committee") {
            override fun toString(): String {
                return "Executive Committee"
            }
        },

        GOV_HIVE_MIND("gov_hive_mind") {
            override fun toString(): String {
                return "Hive Mind"
            }
        },

        GOV_IRENIC_MONARCHY("gov_irenic_monarchy") {
            override fun toString(): String {
                return "Irenic Monarchy"
            }
        },

        GOV_MACHINE_EMPIRE("gov_machine_empire") {
            override fun toString(): String {
                return "Machine Empire"
            }
        },

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

        GOV_MARTIAL_EMPIRE("gov_martial_empire") {
            override fun toString(): String {
                return "Martial Empire"
            }
        },

        GOV_MEGACORPORATION("gov_megacorporation") {
            override fun toString(): String {
                return "Megacorporation"
            }
        },

        GOV_MILITARY_COMMISSARIAT("gov_military_commissariat") {
            override fun toString(): String {
                return "Military Commissariat"
            }
        },

        GOV_MILITARY_JUNTA("gov_military_junta") {
            override fun toString(): String {
                return "Military Junta"
            }
        },

        GOV_REPRESENTATIVE_DEMOCRACY("gov_representative_democracy") {
            override fun toString(): String {
                return "Representative Democracy"
            }
        },

        GOV_STAR_EMPIRE("gov_star_empire") {
            override fun toString(): String {
                return "Star Empire"
            }
        },

        GOV_THEOCRATIC_REPUBLIC("gov_theocratic_republic") {
            override fun toString(): String {
                return "Theocratic Republic"
            }
        },

        GOV_TRADE_LEAGUE("gov_trade_league") {
            override fun toString(): String {
                return "Trade League"
            }
        },

        Default("none_selected")

        // TODO("Requires completion.  Refer to: [https://stellaris.paradoxwikis.com/Government#Government_Type]")
    }

    /**
     * The Advisor Voice for this Empire.
     */
    enum class AdvisorVoice(val repr: String) {
        L_EVIL_CORP("l_evil_corp") {
            override fun toString(): String {
                return "Evil Corp"
            }
        },

        L_HIVEMIND("l_hivemind") {
            override fun toString(): String {
                return "Hivemind"
            }
        },

        L_NECROID_VIR("l_necroid_vir") {
            override fun toString(): String {
                return "Necroid"
            }
        },

        L_PACIFIST("l_pacifist") {
            override fun toString(): String {
                return "Pacifist"
            }
        },

        L_SLICK_CORP("l_slick_corp") {
            override fun toString(): String {
                return "Slick Corp"
            }
        },

        L_SPIRITUALIST("l_spiritualist") {
            override fun toString(): String {
                return "Spiritualist"
            }
        },

        L_THE_WORKER("l_the_worker") {
            override fun toString(): String {
                return "The Worker"
            }
        },

        Default("none_selected")
    }

    /**
     * Planet Class is the Planet-type of the starting planet.
     */
    enum class PlanetClass(val repr: String) {
        PC_ARCTIC("pc_arctic") {
            override fun toString(): String {
                return "Arctic"
            }
        },

        PC_ARID("pc_arid") {
            override fun toString(): String {
                return "Arid"
            }
        },

        PC_CONTINENTAL("pc_continental") {
            override fun toString(): String {
                return "Continental"
            }
        },

        PC_DESERT("pc_desert") {
            override fun toString(): String {
                return "Desert"
            }
        },

        PC_HIVE("pc_hive") {
            override fun toString(): String {
                return "Hive"
            }
        },

        PC_MACHINE("pc_machine") {
            override fun toString(): String {
                return "Machine"
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
                "    speciesKey='$speciesKey'\n" +
                "    shipPrefix='$shipPrefix'\n" +
                "    primarySpecies=\n    $primarySpecies\n" +
                "    ${
                    if (secondarySpecies.name != "DEFAULT") {
                        "secondarySpecies=\n    $secondarySpecies\n"
                    } else ""
                }" +
                "    name='$name'\n" +
                "    adjective='$adjective'\n" +
                "    authority=$authority\n" +
                "    government=$government\n" +
                "    advisorVoice=$advisorVoice\n" +
                "    planetName='$planetName'\n" +
                "    planetClass=$planetClass\n" +
                "    systemName='$systemName'\n" +
                "    initialiser=$initialiser\n" +
                "    graphicalCulture=$graphicalCulture\n" +
                "    cityGraphicalCulture=$cityGraphicalCulture\n" +
                "    empireFlag=$empireFlag\n" +
                "    ruler=$ruler\n" +
                "    spawnAsFallen=$spawnAsFallen\n" +
                "    ignorePortraitDuplication=$ignorePortraitDuplication\n" +
                "    room=$room\n" +
                "    spawnEnabled=$spawnEnabled\n" +
                "    ethic=$ethic\n" +
                "    civics=${civics}\n" +
                "    origin=$origin\n\n"
    }
}
