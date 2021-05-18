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

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

object CustomStyle {
    private object FontSize {
        val titleText = 24.sp
        val paragraphText = 16.sp
    }

    object DropDownSize {
        val short = 200.dp
        val medium = 500.dp
        val long = 1000.dp
    }

    object PadValue {
        val standard = 16.dp
        val double = standard * 2
        val half = standard / 2
    }

    object CustomText {
        val titleText = TextStyle(
            color = Color.Black,
            fontWeight = FontWeight.ExtraBold,
            fontSize = FontSize.titleText
        )

        val tagText = TextStyle(
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = FontSize.paragraphText
        )

        val paragraphText = TextStyle(
            color = Color.Black,
            fontWeight = FontWeight.Normal,
            fontSize = FontSize.paragraphText
        )
    }
}
