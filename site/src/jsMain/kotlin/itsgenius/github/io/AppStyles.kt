package itsgenius.github.io

import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ScrollBehavior
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.forms.ButtonStyle
import com.varabyte.kobweb.silk.components.forms.ButtonVars
import com.varabyte.kobweb.silk.components.layout.HorizontalDividerStyle
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.addVariantBase
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.theme.colors.palette.color
import com.varabyte.kobweb.silk.theme.colors.palette.toPalette
import com.varabyte.kobweb.silk.theme.modifyStyleBase
import itsgenius.github.io.components.Res
import org.jetbrains.compose.web.css.*

@InitSilk
fun initSiteStyles(ctx: InitSilkContext) {
    // This site does not need scrolling itself, but this is a good demonstration for how you might enable this in your
    // own site. Note that we only enable smooth scrolling unless the user has requested reduced motion, which is
    // considered a best practice.
    ctx.stylesheet.registerStyle("html") {
        cssRule(CSSMediaQuery.MediaFeature("prefers-reduced-motion", StylePropertyValue("no-preference"))) {
            Modifier.scrollBehavior(ScrollBehavior.Smooth)
        }
    }

    ctx.stylesheet.registerStyle("body") {
        Modifier
            .fontFamily("IBM Plex Mono, Ubuntu, PT Sans, Arial, sans-serif")
            .fontSize(18.px)
            .lineHeight(1.5)
            .fontWeight(FontWeight.Normal)
    }

    // Silk dividers only extend 90% by default; we want full width dividers in our site
    ctx.theme.modifyStyleBase(HorizontalDividerStyle) {
        Modifier.fillMaxWidth()
    }
}

val titleTextStyle = CssStyle.base {
    Modifier
        .fontSize(1.cssRem)
        .textAlign(TextAlign.Start)
        .lineHeight(1.2) //1.5x doesn't look as good on very large text
        .fontFamily(Res.Fonts.UBUNTU)
        .fontWeight(FontWeight.Normal)
}

val HeadlineTextStyle = CssStyle.base {
    Modifier
        .fontSize(3.cssRem)
        .textAlign(TextAlign.Start)
        .lineHeight(1.2) //1.5x doesn't look as good on very large text
        .fontFamily(Res.Fonts.UBUNTU)
        .color(color = colorMode.toSitePalette().textPrimary)
        .fontWeight(FontWeight.Normal)
}

val SubheadlineTextStyle = CssStyle.base {
    Modifier
        .fontSize(1.cssRem)
        .textAlign(TextAlign.Start)
        .color(colorMode.toPalette().color.toRgb().copyf(alpha = 0.8f))
        .fontFamily(Res.Fonts.UBUNTU)
        .fontWeight(FontWeight.Normal)
}

val btnPrimaryTextColor = CssStyle.base {
    Modifier
        .fontSize(1.cssRem)
        .textAlign(TextAlign.Start)
        .color(colorMode.toSitePalette().textPrimary.toRgb().copyf(alpha = 0.8f))
        .fontFamily(Res.Fonts.UBUNTU)
        .fontWeight(FontWeight.Normal)
}

val btnSecondaryTextColor = CssStyle.base {
    Modifier
        .fontSize(1.cssRem)
        .textAlign(TextAlign.Start)
        .color(colorMode.toSitePalette().iconTintDark.toRgb().copyf(alpha = 0.8f))
        .lineHeight(24.px)
        .fontFamily(Res.Fonts.UBUNTU)
        .fontWeight(FontWeight.Normal)
}

val CircleButtonVariant = ButtonStyle.addVariantBase {
    Modifier.padding(0.px).borderRadius(50.percent)
}

val UncoloredButtonVariant = ButtonStyle.addVariantBase {
    Modifier.setVariable(ButtonVars.BackgroundDefaultColor, Colors.Transparent)
}
