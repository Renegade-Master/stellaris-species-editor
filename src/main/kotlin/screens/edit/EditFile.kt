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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSizeIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import screens.ApplicationState
import util.CustomStyle
import util.Resource
import util.empire.UserEmpire

@Composable
fun editFileScreen(appState: MutableState<ApplicationState>): MutableState<ApplicationState> {
    val logger = util.Logger.getLogger(object {}.javaClass.enclosingMethod.name)

    val adjectiveDdmExpanded: MutableState<Boolean> = remember { mutableStateOf(false) }
    val authorityDdmExpanded: MutableState<Boolean> = remember { mutableStateOf(false) }
    val currentSpecies: MutableState<Int> = remember { mutableStateOf(0) }
    val governmentDdmExpanded: MutableState<Boolean> = remember { mutableStateOf(false) }
    val speciesDdmExpanded: MutableState<Boolean> = remember { mutableStateOf(false) }

    val adjectiveTag = Resource.getStringResource("misc-text-adjective")
    val authorityTag = Resource.getStringResource("misc-text-authority")
    val biographyTag = Resource.getStringResource("misc-text-biography")
    val governmentTag = Resource.getStringResource("misc-text-government")
    val speciesTag = Resource.getStringResource("misc-text-species")

    val userEmpireList: ArrayList<UserEmpire> = Resource.getUserEmpireList()

    val editScreenScrollState = rememberScrollState()

    logger.trace { "User Empire Count: ${userEmpireList.size}" }
    logger.trace { "Names: ${userEmpireList.joinToString { ue -> ue.name }}" }
    logger.trace { "All Empires:\n${userEmpireList.joinToString { ue -> ue.toString() }}" }

    // Main Column making up this Screen
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(state = editScreenScrollState)
    ) {
        // Species Selection and Biography
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Species Selection
            Column(
                modifier = Modifier
                    .weight(0.10f),
            ) {
                Text(
                    modifier = Modifier
                        .padding(CustomStyle.PadValue.half),
                    text = buildAnnotatedString {
                        withStyle(SpanStyle(fontWeight = FontWeight.Bold)) {
                            append(speciesTag)
                        }
                    }
                )
            }

            // Species lister
            Column(
                modifier = Modifier
                    .weight(0.20f),
                horizontalAlignment = Alignment.End
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = userEmpireList[currentSpecies.value].name
                        )
                    }

                    Column {
                        Box(
                            modifier = Modifier,
                        ) {
                            IconButton(onClick = {
                                logger.debug { "Species DropDownMenu Expanded" }; speciesDdmExpanded.value = true
                            }) {
                                Icon(
                                    Icons.Filled.MoreVert,
                                    contentDescription = "Open Species Drop-Down menu"
                                )
                            }

                            DropdownMenu(
                                modifier = Modifier
                                    .requiredSizeIn(maxHeight = CustomStyle.DropDownSize.short),
                                expanded = speciesDdmExpanded.value,
                                onDismissRequest = {
                                    logger.debug { "Species DropDownMenu Collapsed" }
                                    speciesDdmExpanded.value = false
                                }
                            ) {
                                userEmpireList.forEachIndexed { index, ue ->
                                    DropdownMenuItem(
                                        onClick = {
                                            logger.debug { "Selected Species: ${ue.name}" }
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
            }

            // Biography tag
            Column(
                modifier = Modifier
                    .weight(0.15f),
            ) {
                Text(
                    modifier = Modifier
                        .padding(CustomStyle.PadValue.half),
                    text = biographyTag,
                    style = TextStyle(fontWeight = FontWeight.Bold)
                )
            }

            // Biography content
            Column(
                modifier = Modifier
                    .weight(0.55f),
            ) {
                TextField(
                    modifier = Modifier
                        .fillMaxWidth(),
                    value = "TestString",
                    onValueChange = {},
                    enabled = false,
                )
            }
        }

        // Species properties Row 0
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "$adjectiveTag: ${userEmpireList[currentSpecies.value].adjective}"
            )

            Box {
                IconButton(onClick = {
                    logger.debug { "Adjective DropDownMenu Expanded" }; adjectiveDdmExpanded.value = true
                }) {
                    Icon(
                        Icons.Filled.MoreVert,
                        contentDescription = "Open Species Drop-Down menu"
                    )
                }

                DropdownMenu(
                    modifier = Modifier.requiredSizeIn(maxHeight = CustomStyle.DropDownSize.short),
                    expanded = adjectiveDdmExpanded.value,
                    onDismissRequest = {
                        logger.debug { "Adjective DropDownMenu Collapsed" }
                        adjectiveDdmExpanded.value = false
                    }
                ) {
                    userEmpireList.forEachIndexed { index, ue ->
                        DropdownMenuItem(
                            onClick = {
                                logger.debug { "Selected Adjective: ${ue.adjective}" }
                            }
                        ) {
                            Text(ue.adjective)
                        }
                    }
                }
            }

            Text(
                text = "$authorityTag: ${userEmpireList[currentSpecies.value].authority}"
            )

            Box {
                IconButton(onClick = {
                    logger.debug { "Authority DropDownMenu Expanded" }; authorityDdmExpanded.value = true
                }) {
                    Icon(
                        Icons.Filled.MoreVert,
                        contentDescription = "Open Species Drop-Down menu"
                    )
                }

                DropdownMenu(
                    modifier = Modifier.requiredSizeIn(maxHeight = CustomStyle.DropDownSize.short),
                    expanded = authorityDdmExpanded.value,
                    onDismissRequest = {
                        logger.debug { "Authority DropDownMenu Collapsed" }
                        authorityDdmExpanded.value = false
                    }
                ) {
                    userEmpireList.forEachIndexed { index, ue ->
                        DropdownMenuItem(
                            onClick = {
                                logger.debug { "Selected Authority: ${ue.authority}" }
                            }
                        ) {
                            Text(ue.authority.toString())
                        }
                    }
                }
            }

            Text(
                text = "$governmentTag: ${userEmpireList[currentSpecies.value].government}"
            )

            Box {
                IconButton(onClick = {
                    logger.debug { "Government DropDownMenu Expanded" }; governmentDdmExpanded.value = true
                }) {
                    Icon(
                        Icons.Filled.MoreVert,
                        contentDescription = "Open Species Drop-Down menu"
                    )
                }

                DropdownMenu(
                    modifier = Modifier.requiredSizeIn(maxHeight = CustomStyle.DropDownSize.short),
                    expanded = governmentDdmExpanded.value,
                    onDismissRequest = {
                        logger.debug { "Government DropDownMenu Collapsed" }
                        governmentDdmExpanded.value = false
                    }
                ) {
                    userEmpireList.forEachIndexed { index, ue ->
                        DropdownMenuItem(
                            onClick = {
                                logger.debug { "Selected Government: ${ue.government}" }
                            }
                        ) {
                            Text(ue.government.toString())
                        }
                    }
                }
            }
        }
    }

    return appState
}
