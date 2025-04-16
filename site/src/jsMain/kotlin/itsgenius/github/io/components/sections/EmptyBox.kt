package itsgenius.github.io.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.CSSLengthOrPercentageNumericValue
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.width

@Composable
fun EmptyBoxSmallVertical(size: CSSLengthOrPercentageNumericValue) {
    Box(modifier = Modifier.height(size))
}

@Composable
fun EmptyBoxSmallHorizontal(size: CSSLengthOrPercentageNumericValue) {
    Box(modifier = Modifier.width(size))
}