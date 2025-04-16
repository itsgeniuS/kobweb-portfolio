package itsgenius.github.io.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.silk.components.layout.HorizontalDivider
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import itsgenius.github.io.components.styles.footerContentText
import itsgenius.github.io.toSitePalette
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div

@Composable
fun FooterTermsRightsSocialMedia(
    modifier : Modifier = Modifier,
) {
    val palette = ColorMode.current.toSitePalette()

    Column (
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        HorizontalDivider(modifier = Modifier.backgroundColor(color = palette.dividerColor).height(0.5.px))

        FooterSocialIconList()

        Box(Modifier.height(1.cssRem))

        Div(footerContentText.toAttrs()) {
            SpanText("© 2025 Thulasirajan. All rights reserved.", modifier = Modifier.weight(1f))
        }

        Box(Modifier.height(1.cssRem))

        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Div(footerContentText.toAttrs()) {
                SpanText("Privacy policy")
            }

            Box(Modifier.width(1.cssRem))

            Div(footerContentText.toAttrs()) {
                SpanText("Terms & conditions")
            }
        }

        Box(Modifier.height(1.cssRem))

        Div(footerContentText.toAttrs()) {
            SpanText("Built with kobweb ❤")
        }

        Box(Modifier.height(1.cssRem))
    }
}
