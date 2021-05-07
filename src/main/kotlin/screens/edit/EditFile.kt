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

package screens.edit

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import screens.ApplicationState
import util.CustomStyle
import util.Resource
import util.empire.UserEmpire

@Composable
fun editFileScreen(appState: MutableState<ApplicationState>): MutableState<ApplicationState> {
    val userEmpireList: ArrayList<UserEmpire> = Resource.getUserEmpireList()
    val userEmpireListNames: ArrayList<String> = arrayListOf()
    val scrollState = rememberScrollState()

    userEmpireList.forEach { userEmpireListNames.add(it.speciesKey) }

    Card() {
        Column(
            modifier = Modifier.verticalScroll(state = scrollState)
        ) {
            Row() {
                Text(
                    text = "User Empire Count: ${userEmpireList.size}"
                )
            }
            Spacer(modifier = Modifier.size(CustomStyle.PadValue.standard))
            Row() {
                Text(
                    text = "Names: \n${userEmpireListNames}"
                )
            }
            Spacer(modifier = Modifier.size(CustomStyle.PadValue.standard))
            Row() {
                Text(
                    text = "User Empire 0:\n${userEmpireList[0]}"
                )
            }
            Spacer(modifier = Modifier.size(CustomStyle.PadValue.standard))
            Row() {
                Text(
                    text = "All Empires:\n${userEmpireList}"
                )
            }
        }
    }

    return appState
}
