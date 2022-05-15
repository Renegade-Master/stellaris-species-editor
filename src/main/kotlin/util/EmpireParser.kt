package util

import dao.empire.UserEmpire

interface EmpireParser {
    fun parseEmpire(userEmpireString: String): ArrayList<UserEmpire>
}
