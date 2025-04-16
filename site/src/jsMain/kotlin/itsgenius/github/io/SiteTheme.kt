package itsgenius.github.io

import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.colors.palette.background
import com.varabyte.kobweb.silk.theme.colors.palette.color

/**
 * @property nearBackground A useful color to apply to a container that should differentiate itself from the background
 *   but just a little.
 */
class SitePalette(
    val nearBackground: Color,
    val cobweb: Color,
    val brand: Brand,
    val textPrimary: Color = Color.rgb(0x12F7D6),
    val textSecondary: Color= Color.rgb(0xFFFFFF),
    val iconTintLight: Color= Color.rgb(0xFFFFFF),
    val iconTintDark: Color = Color.rgb(0x292F36),
    val bgColor: Color = Color.rgb(0x292F36),
    val dividerColor: Color = Color.rgb(0x43454D),
    val tabBg: Color = Color.rgb(0x1A1E23),
    val cardBg: Color = Color.rgb(0x1A1E23),
    val gray: Color = Color.rgb(0x43454D)
) {
    class Brand(
        val primary: Color = Color.rgb(0x12F7D6),
        val accent: Color = Color.rgb(0x1A1E23),
        val bgColor: Color = Color.rgb(0x292F36),
    )
}

object SitePalettes {
    val light = SitePalette(
        nearBackground = Color.rgb(0xF4F6FA),
        cobweb = Colors.LightGray,
        brand = SitePalette.Brand(
            primary =  Color.rgb(0x12F7D6),
            accent =  Color.rgb(0x292F36),
        )
    )
    val dark = SitePalette(
        nearBackground = Color.rgb(0x13171F),
        cobweb = Colors.LightGray.inverted(),
        brand = SitePalette.Brand(
            primary = Color.rgb(0x12F7D6),
            accent =  Color.rgb(0x292F36),
        )
    )
}

fun ColorMode.toSitePalette(): SitePalette {
    return when (this) {
        ColorMode.LIGHT -> SitePalettes.light
        ColorMode.DARK -> SitePalettes.dark
    }
}

@InitSilk
fun initTheme(ctx: InitSilkContext) {
    ctx.theme.palettes.light.background = Color.rgb(0xFAFAFA)
    ctx.theme.palettes.light.color = Colors.Black
    ctx.theme.palettes.dark.background = Color.rgb(0x06080B)
    ctx.theme.palettes.dark.color = Colors.White
}
