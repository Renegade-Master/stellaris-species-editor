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
