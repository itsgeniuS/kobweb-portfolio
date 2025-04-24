package itsgenius.github.io.components.layouts

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.ColumnScope
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.toAttrs
import itsgenius.github.io.components.sections.FooterTermsRightsSocialMedia
import itsgenius.github.io.components.sections.NavHeader
import kotlinx.browser.document
import org.jetbrains.compose.web.css.fr
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.dom.Div

@Composable
fun PageLayoutWithoutFooter(title: String, content: @Composable ColumnScope.() -> Unit) {
    LaunchedEffect(title) {
        document.title = "Kobweb - $title"
    }
    Box(
        Modifier
            .fillMaxWidth()
            .minHeight(100.percent)
            .backgroundColor(Color.rgb(0x292F36))
            .gridTemplateRows { size(1.fr); size(minContent) },
        contentAlignment = Alignment.Center
    ) {
        Column(
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            NavHeader()
            Div(PageContentStyle.toAttrs()) {
                content()
            }
            FooterTermsRightsSocialMedia()
        }
    }
}