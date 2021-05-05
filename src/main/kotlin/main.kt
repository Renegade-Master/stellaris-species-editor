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

import androidx.compose.desktop.Window
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import screens.ApplicationState
import screens.edit.editFileScreen
import screens.title.title
import screens.welcome.welcomeScreen
import util.CustomStyle
import util.Resource
import kotlin.system.exitProcess

fun main() = Window(
    title = Resource.getStringResource("title-text")
) {
    // State management for the application
    var applicationState = remember { mutableStateOf<ApplicationState>(ApplicationState.Welcome) }

    // Container for all screens
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(CustomStyle.PadValue.standard),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Title text
        title()

        // Application State handler
        applicationState = when (applicationState.value) {
            ApplicationState.Welcome -> {
                welcomeScreen(applicationState)
            }

            ApplicationState.EditFile -> {
                editFileScreen(applicationState)
            }

            ApplicationState.Quitting -> exitProcess(0)
        }
    }
}
