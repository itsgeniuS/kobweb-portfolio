package itsgenius.github.io.pages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.ColumnDefaults
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toAttrs
import itsgenius.github.io.HeadlineTextStyle
import itsgenius.github.io.components.Res
import itsgenius.github.io.components.Res.Icons.HEADER_DIVIDER
import itsgenius.github.io.components.Res.Images.BLOGS_SCROLL
import itsgenius.github.io.components.layouts.PageLayoutWithoutFooter
import itsgenius.github.io.components.routes.Routes
import itsgenius.github.io.components.sections.BtnFilled
import itsgenius.github.io.components.sections.BtnOutlined
import itsgenius.github.io.components.sections.EmptyBoxSmallVertical
import itsgenius.github.io.components.sections.blog.BlogListItem
import itsgenius.github.io.components.sections.blog.recentBlogsList
import itsgenius.github.io.components.styles.blogContentHint
import itsgenius.github.io.components.widgets.PageHeaderInfo
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.dom.Div

/**
 * @Author: Thulasirajan P
 * @github: https:github.com/itsgeniuS
 * @Date: 05/04/25
 */
@Page(Routes.blogs)
@Composable
fun BlogListingPage() {
    PageLayoutWithoutFooter("Blogs") {
        val pageHeader = remember {
            mutableStateOf(
                PageHeaderInfo(
                    title = "Blogs",
                    desc = "My thoughts on android, and about the tools that i use",
                    canShowIcon = true,
                    icon = BLOGS_SCROLL,
                    iconName = "Blogs",
                )
            )
        }

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = ColumnDefaults.VerticalArrangement,
            horizontalAlignment = Alignment.CenterHorizontally,
            content = {
                if (pageHeader.value.canShowIcon) {
                    Image(
                        pageHeader.value.icon,
                        pageHeader.value.iconName,
                        Modifier.height(6.cssRem).display(DisplayStyle.Block)
                    )
                }

                EmptyBoxSmallVertical(size = 1.cssRem)

                Div(HeadlineTextStyle.toAttrs()) {
                    SpanText(
                        modifier = Modifier.padding(top = 1.cssRem),
                        text = pageHeader.value.title,
                    )
                }

                Image(
                    src = HEADER_DIVIDER,
                    description = "header_divider",
                    modifier = Modifier.padding(top = 1.cssRem),
                )

                EmptyBoxSmallVertical(size = 1.cssRem)

                Div(blogContentHint.toAttrs()) {
                    SpanText(pageHeader.value.desc)
                }

                EmptyBoxSmallVertical(size = 1.15.cssRem)

                SimpleGrid(
                    numColumns = numColumns(
                        sm = 1,
                        md = 1,
                        xl = 2,
                        base = 1,
                        lg = 2,
                    ),
                    modifier = Modifier.fillMaxWidth()
                        .gap(1.cssRem),
                    content = {
                        recentBlogsList.forEach { blogItem ->
                            BlogListItem(
                                modifier = Modifier.fillMaxWidth()
                                    .margin(0.5.cssRem),
                                blogItem = blogItem,
                                onClick = {

                                }
                            )
                        }
                    }
                )

                Row(
                    modifier = Modifier.gap(1.cssRem).padding(top = 1.cssRem),
                    verticalAlignment = Alignment.CenterVertically,
                    content = {
                        BtnOutlined(
                            btnTitle = Res.StringRes.VIEW_MORE,
                            onClick = {

                            },
                        )

                        BtnFilled(
                            btnTitle = Res.StringRes.SUBSCRIBE,
                            onClick = {

                            },
                        )
                    }
                )

                EmptyBoxSmallVertical(size = 1.cssRem)
            }
        )
    }
}