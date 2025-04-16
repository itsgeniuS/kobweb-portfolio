package itsgenius.github.io.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.alignContent
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.outline
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import itsgenius.github.io.btnPrimaryTextColor
import itsgenius.github.io.btnSecondaryTextColor
import itsgenius.github.io.toSitePalette
import org.jetbrains.compose.web.css.AlignContent
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.dom.Div

val btnSolid = CssStyle.base {
    Modifier
        .outline(
            width = 0.15.cssRem,
            color = colorMode.toSitePalette().brand.primary,
            style = LineStyle.Solid,
        )
        .backgroundColor(color = colorMode.toSitePalette().brand.primary)
        .borderRadius(30.cssRem)
        .alignContent(AlignContent.Center)
}

val btnOutlined = CssStyle.base {
    Modifier
        .outline(
            width = 0.15.cssRem,
            color = colorMode.toSitePalette().brand.primary,
            style = LineStyle.Solid,
        )
        .backgroundColor(color = colorMode.toSitePalette().brand.bgColor)
        .borderRadius(30.cssRem)
        .alignContent(AlignContent.Center)
}

@Composable
fun BtnFilled(
    modifier: Modifier = Modifier,
    btnTitle: String,
    onClick: () -> Unit,
) {
    var colorMode = ColorMode.current
    Button(
        modifier = btnSolid.toModifier().then(modifier),
        onClick = {
            colorMode = colorMode.opposite
            onClick.invoke()
        },
        content = {
            Div(btnSecondaryTextColor.toAttrs()) {
                SpanText(text = btnTitle)
            }
        }
    )
}

@Composable
fun BtnOutlined(
    modifier: Modifier = Modifier,
    btnTitle: String,
    onClick: () -> Unit,
) {
    var colorMode = ColorMode.current
    Button(
        modifier = btnOutlined.toModifier().then(modifier),
        onClick = {
            colorMode = colorMode.opposite
            onClick.invoke()
        },
        content = {
            Div(btnPrimaryTextColor.toAttrs()) {
                SpanText(text = btnTitle)
            }
        }
    )
}