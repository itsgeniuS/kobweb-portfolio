package itsgenius.github.io.components.styles

import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.css.TextOverflow
import com.varabyte.kobweb.compose.css.WhiteSpace
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.navigation.LinkStyle
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.addVariant
import com.varabyte.kobweb.silk.style.base
import itsgenius.github.io.components.Res
import itsgenius.github.io.toSitePalette
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px

val blogContentHint = CssStyle.base {
    Modifier
        .fontSize(0.75.cssRem)
        .textAlign(TextAlign.Start)
        .lineHeight(1.2)
        .overflow(Overflow.Hidden)
        .color(color = colorMode.toSitePalette().iconTintLight.toRgb())
        .letterSpacing(value = 1.25.px)
        .styleModifier {
            property("display", "-webkit-box")
            property("-webkit-box-orient", "vertical")
            property("-webkit-line-clamp", "1")
        }
        .borderRadius(8.cssRem)
        .padding(left = 4.px, bottom = 6.px)
        .fontFamily(Res.Fonts.IBM_PLEX_MONO)
        .fontWeight(FontWeight.Normal)
}

val blogDummyHintTop = CssStyle.base {
    Modifier
        .fontSize(0.75.cssRem)
        .textAlign(TextAlign.Start)
        .lineHeight(1.2)
        .overflow(Overflow.Hidden)
        .color(color = colorMode.toSitePalette().textPrimary.toRgb())
        .fontStyle(FontStyle.Italic)
        .letterSpacing(value = 1.25.px)
        .styleModifier {
            property("display", "-webkit-box")
            property("-webkit-box-orient", "vertical")
            property("-webkit-line-clamp", "1")
        }
        .borderRadius(8.cssRem)
        .padding(left = 4.px, bottom = 6.px)
        .fontFamily(Res.Fonts.IBM_PLEX_MONO)
        .fontWeight(FontWeight.Normal)
}

val blogDummyHintEnd = CssStyle.base {
    Modifier
        .fontSize(0.75.cssRem)
        .textAlign(TextAlign.Start)
        .lineHeight(1.2)
        .overflow(Overflow.Hidden)
        .color(color = colorMode.toSitePalette().textPrimary.toRgb())
        .fontStyle(FontStyle.Italic)
        .letterSpacing(value = 1.25.px)
        .styleModifier {
            property("display", "-webkit-box")
            property("-webkit-box-orient", "vertical")
            property("-webkit-line-clamp", "1")
        }
        .borderRadius(8.cssRem)
        .padding(left = 4.px, top = 6.px)
        .fontFamily(Res.Fonts.IBM_PLEX_MONO)
        .fontWeight(FontWeight.Normal)
}

val blogTitleStyle = CssStyle.base {
    Modifier.fontSize(1.25.cssRem)
        .textAlign(TextAlign.Start)
        .lineHeight(1.05)
        .overflow(Overflow.Hidden)
        .styleModifier {
            property("display", "-webkit-box")
            property("-webkit-box-orient", "vertical")
            property("-webkit-line-clamp", "2")
        }
        .fontFamily(Res.Fonts.UBUNTU)
        .color(color = colorMode.toSitePalette().textPrimary)
        .fontWeight(FontWeight.Normal)
}

val blogDescStyle = CssStyle.base {
    Modifier
        .fontSize(0.9.cssRem)
        .textAlign(TextAlign.Start)
        .lineHeight(1.4)
        .overflow(Overflow.Hidden)
        .styleModifier {
            property("display", "-webkit-box")
            property("-webkit-box-orient", "vertical")
            property("-webkit-line-clamp", "2")
        }
        .fontFamily(Res.Fonts.UBUNTU)
        .fontWeight(FontWeight.Thin)
}

val blogSmallTextStyle = CssStyle.base {
    Modifier
        .fontSize(0.65.cssRem)
        .textAlign(TextAlign.Start)
        .lineHeight(1.2)
        .overflow(Overflow.Hidden)
        .borderRadius(8.cssRem)
        .padding(4.px, 8.px)
        .fontFamily(Res.Fonts.UBUNTU)
        .fontWeight(FontWeight.Normal)
        .overflow(Overflow.Hidden)
        .whiteSpace(WhiteSpace.NoWrap)
        .textOverflow(TextOverflow.Ellipsis)
}

val tagsTextStyle = CssStyle.base {
    Modifier
        .fontSize(0.65.cssRem)
        .textAlign(TextAlign.Start)
        .lineHeight(1.2)
        .borderRadius(8.cssRem)
        .border(1.px, LineStyle.Solid, colorMode.toSitePalette().gray.toRgb())
        .padding(4.px, 8.px)
        .backgroundColor(colorMode.toSitePalette().gray)
        .color(colorMode.toSitePalette().iconTintLight.toRgb())
        .fontFamily(Res.Fonts.UBUNTU)
        .fontWeight(FontWeight.Normal)
        .overflow(Overflow.Hidden)
        .whiteSpace(WhiteSpace.NoWrap)
        .textOverflow(TextOverflow.Ellipsis)
}

val ItalicUnderlinedLinkVariant = LinkStyle.addVariant {
    base {
        Modifier.fontStyle(FontStyle.Italic)
            .textDecorationLine(TextDecorationLine.Underline)
            .textAlign(TextAlign.End)
            .fontWeight(FontWeight.Normal)
            .fontFamily(Res.Fonts.UBUNTU)
            .overflow(Overflow.Hidden)
            .whiteSpace(WhiteSpace.NoWrap)
            .textOverflow(TextOverflow.Ellipsis)
    }
}

val footerContentText = CssStyle.base {
    Modifier
        .fontSize(1.cssRem)
        .textAlign(TextAlign.Start)
        .lineHeight(1.2)
        .overflow(Overflow.Hidden)
        .borderRadius(8.cssRem)
        .padding(4.px, 8.px)
        .fontFamily(Res.Fonts.UBUNTU)
        .fontWeight(FontWeight.Normal)
        .overflow(Overflow.Hidden)
        .whiteSpace(WhiteSpace.NoWrap)
        .textOverflow(TextOverflow.Ellipsis)
}
