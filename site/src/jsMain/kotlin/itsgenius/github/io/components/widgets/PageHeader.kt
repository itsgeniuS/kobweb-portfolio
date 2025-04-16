package itsgenius.github.io.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.functions.RadialGradient.Shape.Circle
import com.varabyte.kobweb.compose.dom.svg.Circle
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.alignContent
import com.varabyte.kobweb.compose.ui.modifiers.display
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.HorizontalDivider
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toAttrs
import itsgenius.github.io.HeadlineTextStyle
import org.jetbrains.compose.web.css.CSSLengthOrPercentageValue
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.P

data class PageHeaderInfo(
    val title: String,
    val desc: String,
    val canShowIcon: Boolean = false,
    val icon: String,
    val iconName: String,
)
///kobweb-logo.png
//"Kobweb Logo"

@Composable
fun PageHeader(
    modifier: Modifier = Modifier.fillMaxWidth(),
    pageHeader: PageHeaderInfo,
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center,
        content = {
            Column(modifier = Modifier, verticalArrangement = Arrangement.Center,
                content = {
                if(pageHeader.canShowIcon) {
                    Image(pageHeader.icon, pageHeader.iconName, Modifier.height(6.cssRem).display(DisplayStyle.Block))
                }
                Box(modifier = Modifier.padding(top = 1.cssRem))
                Div(HeadlineTextStyle.toAttrs()) {
                    SpanText(
                        modifier = Modifier.padding(top = 1.cssRem),
                        text = pageHeader.title,
                    )
                    Row {
                        Circle()
                        HorizontalDivider()
                        Circle()
                    }
                }
                SpanText(pageHeader.desc)
            },
                )
        }
    )
}
