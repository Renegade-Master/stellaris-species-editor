package dao.empire

data class Ruler(val name: String) {
    val gender: Gender = Gender.Default
    val portrait: Portrait = Portrait.Default
    val texture: Int = 0
    val hair: Int = 0
    val clothes: Int = 0
    val rulerTitle: String = ""
    val leaderClass: String = ""


    enum class Gender(val repr: String) {
        FEMALE("FEMALE") {
            override fun toString(): String {
                return "Female"
            }
        },

        MALE("MALE") {
            override fun toString(): String {
                return "Male"
            }
        },

        Default("none_selected")
    }

    enum class Portrait(val repr: String) {
        Default("none_selected")
    }

}
