package mapper

import antlr.generated.StellarisBaseListener
import antlr.generated.StellarisParser
import dao.empire.UserEmpire

class StellarisListener : StellarisBaseListener() {
    private lateinit var empireList: ArrayList<UserEmpire>

    fun StellarisListener() {
        this.empireList = ArrayList<UserEmpire>()
    }
}
