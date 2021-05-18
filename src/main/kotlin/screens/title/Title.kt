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

package screens.title

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import screens.ApplicationState
import util.CustomStyle
import util.Resource

@Composable
fun title(state: MutableState<ApplicationState>) {
    val logger = util.Logger.getLogger(object {}.javaClass.enclosingMethod.name)

    val headerText = Resource.getStringResource("application-header")
    val backButtonText = Resource.getStringResource("button-text-back")
    val saveButtonText = Resource.getStringResource("button-text-save")
    val quitButtonText = Resource.getStringResource("button-text-quit")

    val backButtonWeight: Float = 1.0f / 3.0f
    val headerTextWeight: Float = 1.0f / 3.0f
    val saveButtonWeight: Float = 1.0f / 6.0f
    val quitButtonWeight: Float = 1.0f / 6.0f

    // Title Row
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier
                    .weight(weight = backButtonWeight),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                if (state.value != ApplicationState.Welcome) {
                    Button(
                        onClick = { logger.debug { "Back button clicked" }; state.value = ApplicationState.Welcome }
                    ) {
                        Text(
                            text = backButtonText
                        )
                    }
                }
            }

            Column(
                modifier = Modifier
                    .weight(weight = headerTextWeight),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = headerText,
                    style = CustomStyle.CustomText.titleText
                )
            }

            Column(
                modifier = Modifier
                    .weight(weight = saveButtonWeight),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                if (state.value != ApplicationState.Welcome) {
                    Button(
                        onClick = { logger.debug { "Save button clicked" }; state.value = ApplicationState.EditFile }
                    ) {
                        Text(
                            text = saveButtonText
                        )
                    }
                }
            }

            Column(
                modifier = Modifier
                    .weight(weight = quitButtonWeight),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                if (state.value != ApplicationState.Welcome) {
                    Button(
                        onClick = { logger.debug { "Quit button clicked" }; state.value = ApplicationState.Quitting }
                    ) {
                        Text(
                            text = quitButtonText
                        )
                    }
                }
            }
        }
    }
}
