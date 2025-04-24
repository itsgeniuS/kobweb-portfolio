package itsgenius.github.io.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import itsgenius.github.io.components.Res.Icons
import itsgenius.github.io.components.routes.SocialLinks
import itsgenius.github.io.toSitePalette
import kotlinx.browser.window
import org.jetbrains.compose.web.css.*

@Composable
fun FooterSocialIconList() {
    Row(
        modifier = Modifier.padding(top = 8.px),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        EmptyBoxSmallHorizontal(size = 1.cssRem)
        SocialMediaIcon(iconPath = Icons.GITHUB, url = SocialLinks.GITHUB)
        EmptyBoxSmallHorizontal(size = 1.cssRem)
        SocialMediaIcon(iconPath = Icons.LINKED_IN, url = SocialLinks.LINKED_IN)
        EmptyBoxSmallHorizontal(size = 1.cssRem)
        SocialMediaIcon(iconPath = Icons.TELEGRAM, url = SocialLinks.TELEGRAM)
        EmptyBoxSmallHorizontal(size = 1.cssRem)
    }
}

@Composable
fun SocialMediaIcon(
    iconPath: String,
    url: String,
) {
    val colorPalette = ColorMode.current.toSitePalette()

    Box(
        Modifier
            .size(40.px)
            .borderRadius(50.percent)
            .backgroundColor(colorPalette.textPrimary)
            .display(DisplayStyle.Flex)
            .alignItems(AlignItems.Center)
            .justifyContent(JustifyContent.Center)
            .cursor(Cursor.Pointer)
            .onClick {
                window.open(url, "_blank")
            }
    ) {
        Image(iconPath, url, Modifier.height(24.px).width(24.px))
    }
}