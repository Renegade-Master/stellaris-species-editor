package dao.empire

data class Species(var name: String) {
    var speciesClass: String = ""
    var portrait: String = ""
    var plural: String = ""
    var adjective: String = ""
    var biography: String = ""
    var nameList: String = ""
    var traits: MutableList<String> = mutableListOf<String>()

    override fun toString(): String {
        return "Species:\n" +
                "        name='$name'\n" +
                "        speciesClass='$speciesClass'\n" +
                "        portrait='$portrait'\n" +
                "        plural='$plural'\n" +
                "        adjective='$adjective'\n" +
                "        speciesBio='$biography'\n" +
                "        nameList='$nameList'\n" +
                "        traits=$traits"
    }


}
