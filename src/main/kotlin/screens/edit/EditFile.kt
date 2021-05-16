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

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredSizeIn
import androidx.compose.foundation.layout.requiredWidthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import screens.ApplicationState
import util.CustomStyle
import util.Resource
import util.empire.UserEmpire

@Composable
fun editFileScreen(appState: MutableState<ApplicationState>): MutableState<ApplicationState> {
    val logger = util.Logger.getLogger("EditFile")

    val expanded: MutableState<Boolean> = remember { mutableStateOf(false) }
    val currentSpecies: MutableState<Int> = remember { mutableStateOf(0) }

    val userEmpireList: ArrayList<UserEmpire> = Resource.getUserEmpireList()
    val userEmpireListNames: ArrayList<String> = arrayListOf()
    val scrollState = rememberScrollState()

    userEmpireList.forEach { userEmpireListNames.add(it.speciesKey) }

    logger.debug { "User Empire Count: ${userEmpireList.size}" }
    logger.debug { "Names: $userEmpireListNames" }
    logger.debug { "All Empires:\n${userEmpireList}" }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(state = scrollState)
    ) {
        // Species Selection
        Row(
            modifier = Modifier
                .requiredWidthIn(min = 400.dp, max = 400.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
        ) {
            Text(
                text = "Species: ${userEmpireList[currentSpecies.value].name}"
            )

            Box() {
                IconButton(onClick = { expanded.value = true }) {
                    Icon(
                        Icons.Filled.MoreVert,
                        contentDescription = "Open Species Drop-Down menu"
                    )
                }

                DropdownMenu(
                    modifier = Modifier.requiredSizeIn(maxHeight = CustomStyle.DropDownSize.short),
                    expanded = expanded.value,
                    onDismissRequest = { expanded.value = false }
                ) {
                    userEmpireList.forEachIndexed { index, ue ->
                        DropdownMenuItem(
                            onClick = {
                                logger.info { "Selected Species: ${ue.name}" }
                                currentSpecies.value = index
                            }
                        ) {
                            Text(ue.name)
                        }
                    }
                }
            }
        }
    }

    return appState
}
