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

package util

import util.empire.UserEmpire
import java.io.File
import java.io.FileNotFoundException
import java.io.InputStream

object Resource {
    private val logger = Logger.getLogger(object {}.javaClass.name)

    private const val stringFile = "/strings/common-strings.properties"
    private const val applicationPropertiesFile = "/application.properties"

    private val userEmpireLocation =
        "${System.getenv("USERPROFILE")}\\Documents\\Paradox Interactive\\Stellaris\\user_empire_designs.txt"

    fun getStringResource(id: String): String {
        val resourceFile = javaClass.getResourceAsStream(stringFile)

        return readResourceFile(resourceFile, id)
    }

    private fun getUserEmpireAsString(): String {
        val userEmpireFile: File

        try {
            userEmpireFile = File(userEmpireLocation)
        } catch (fnfe: FileNotFoundException) {
            logger.error { "Could not find the 'user_empire_list' in the expected location." }
            return ""
        }

        return userEmpireFile
            .inputStream()
            .readBytes()
            .toString(Charsets.UTF_8)
    }

    fun getUserEmpireList(): ArrayList<UserEmpire> {
        val userEmpireString: String = getUserEmpireAsString()

        return EmpireParser().parseEmpire(userEmpireString)
    }

    fun getApplicationProperty(id: String): String {
        val appProps = javaClass.getResourceAsStream(applicationPropertiesFile)

        return readResourceFile(appProps, id)
    }

    private fun readResourceFile(resource: InputStream?, id: String): String {
        resource?.bufferedReader()?.lines()?.use { lines ->
            for (it in lines) {
                if (it.substringBefore("=") == id) {
                    return it
                        .substringAfter("$id=")
                        .removeSurrounding("\"")
                        .replace("\\n", System.getProperty("line.separator"))
                }
            }
        }

        throw NoSuchFieldException("A Property resource with the requested ID [$id] could not be found.")
    }
}
