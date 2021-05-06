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

object Resource {
    private const val stringFile = "/strings/common-strings.properties"
    private val userEmpireLocation =
        "${System.getenv("USERPROFILE")}\\Documents\\Paradox Interactive\\Stellaris\\user_empire_designs.txt"

    fun getStringResource(id: String): String {
        val resourceFile = javaClass.getResourceAsStream(stringFile)

        resourceFile?.bufferedReader()?.lines()?.use { lines ->
            for (it in lines) {
                if (it.substringBefore("=") == id) {
                    return it
                        .substringAfter("$id=")
                        .removeSurrounding("\"")
                        .replace("\\n", System.getProperty("line.separator"))
                }
            }
        }

        throw NoSuchFieldException("A String resource with the requested ID could not be found.")
    }

    private fun getUserEmpireAsString(): String {
        val userEmpireFile = File(userEmpireLocation)

        return userEmpireFile
            .inputStream()
            .readBytes()
            .toString(Charsets.UTF_8)
    }

    fun getUserEmpireList(): ArrayList<UserEmpire> {
        val userEmpireString: String = getUserEmpireAsString()

        return EmpireParser(userEmpireString)
    }
}
