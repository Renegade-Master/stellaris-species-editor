package dao.empire

data class EmpireFlag(val flagKey: String) {
    object Icon {
        val iconCategory: String = ""
        val iconFile: String = ""
    }

    object Background

    val colours: Array<String> = arrayOf<String>()
}
