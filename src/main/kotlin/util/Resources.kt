package util

object Resources {
    fun getStringResource(id: String): String {
        val stringFile = "/strings/common-strings.properties"

        val resourceFile = javaClass.getResourceAsStream(stringFile)

        resourceFile?.bufferedReader()?.lines()?.use { lines ->
            for (it in lines) {
                if (it.startsWith(id)) {
                    return it.substringAfter("$id=").removeSurrounding("\"")
                }
            }
        }

        throw NoSuchFieldException()
    }
}
