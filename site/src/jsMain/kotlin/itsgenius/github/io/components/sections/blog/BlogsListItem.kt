package itsgenius.github.io.components.sections.blog

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import itsgenius.github.io.components.styles.ItalicUnderlinedLinkVariant
import itsgenius.github.io.components.styles.blogDescStyle
import itsgenius.github.io.components.styles.blogDummyHintEnd
import itsgenius.github.io.components.styles.blogDummyHintTop
import itsgenius.github.io.components.styles.blogSmallTextStyle
import itsgenius.github.io.components.styles.blogTitleStyle
import itsgenius.github.io.components.styles.tagsTextStyle
import itsgenius.github.io.toSitePalette
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

val recentBlogsList = arrayListOf(
    BlogItem(
        title = "Publishing Android App as a Library in Jitpack.io using maven-publish",
        desc = "Hosting an android compose module as a library using jitpack.io and consuming the library in android app",
        link = "https://medium.com/@thulcgenius/publishing-android-app-as-a-library-in-jitpack-io-using-maven-publish-5145cae40fa5",
        tags = listOf("android-jitpack", "library", "dependency"),
        timeStamp = "02 Jan, 2024",
        imageUrl = "https://miro.medium.com/v2/resize:fit:720/format:webp/1*TRIa91rZG7yOAbum-oga9g.jpeg"
    ),
    BlogItem(
        title = "Publishing Android App as a Library Locally using maven-publish",
        desc = "Hosting an android compose module as a library using jitpack.io and consuming the library using mavenLocal in android app",
        link = "http://medium.com/@thulcgenius/publishing-android-app-as-a-library-locally-using-maven-publish-3a5e4f618bbb",
        tags = listOf("android-library", "mavenLocal", "library aar"),
        timeStamp = "12 Aug, 2024",
        imageUrl = "https://miro.medium.com/v2/resize:fit:720/format:webp/1*IyDMyPInoFN_c5qmea1dJQ.jpeg"
    ),
    BlogItem(
        title = "Mastering Navigation in Android Compose UI — Integrating Bottom Navigation and Non-Bottom Menu Screens",
        desc = "Android Jetpack Compose Navigation using navController with bottom menu and simple screens",
        link = "https://medium.com/@thulcgenius/mastering-navigation-in-android-compose-ui-integrating-bottom-navigation-and-non-bottom-menu-c22a115f39f1",
        tags = listOf("jetpack-compose-navigation", "compose-navigation"),
        timeStamp = "25 May, 2024",
        imageUrl = "http://miro.medium.com/v2/resize:fit:720/format:webp/0*rgQUewvhLR98TU27"
    ),
)

data class BlogItem(
    val title: String,
    val desc: String,
    val link: String,
    val tags: List<String>,
    val timeStamp: String,
    val imageUrl: String
)

@Composable
fun BlogListItem(
    modifier : Modifier= Modifier,
    blogItem: BlogItem,
    onClick: () -> Unit,
) {
    val palette = ColorMode.current.toSitePalette()

    val blogItem by remember { mutableStateOf(blogItem) }

    Box(
        modifier = modifier
            .fillMaxWidth()
            .backgroundColor(palette.cardBg)
            .borderRadius(1.cssRem)
            .outline(0.1.cssRem, color = palette.cardBg, style = LineStyle.Solid)
            .padding(1.cssRem)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Div(blogDummyHintTop.toAttrs()) {
                Text("<blogs>")
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    src = blogItem.imageUrl,
                    description = blogItem.title,
                    modifier = Modifier
                        .fillMaxWidth(percent = 30.percent)
                        .height(120.px)
                        .objectFit(ObjectFit.Cover)
                        .borderRadius(0.5.cssRem)
                )

                Box(Modifier.width(1.cssRem))

                Column(
                    modifier = Modifier.fillMaxWidth(percent = 70.percent).padding(left = 1.cssRem)
                ) {
                    Div(blogTitleStyle.toAttrs()) {
                        Text(blogItem.title)
                    }

                    Box(Modifier.height(0.5.cssRem))

                    Div(blogDescStyle.toAttrs()) {
                        Text(blogItem.desc)
                    }

                    Box(Modifier.height(0.5.cssRem))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        if (blogItem.tags.isNotEmpty()) {
                            Div(tagsTextStyle.toAttrs()) {
                                Text(blogItem.tags.first())
                            }
                        }

                        Box(Modifier.width(1.cssRem))

                        Div(blogSmallTextStyle.toAttrs()) {
                            Text("Date: ${blogItem.timeStamp}")
                        }

                        Box(Modifier.width(1.cssRem))

                        Div(blogSmallTextStyle.toAttrs()) {
                            Link(
                                path = blogItem.link,
                                variant = ItalicUnderlinedLinkVariant
                            ) {
                                Text("Read More >>> ")
                            }
                        }
                    }
                }
            }

            Div(blogDummyHintEnd.toAttrs()) {
                Text("</blogs>")
            }
        }
    }
}