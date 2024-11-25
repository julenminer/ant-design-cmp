package theme.color

import androidx.compose.ui.graphics.Color

fun generateColors(palette: ColorPalette): AntdColor =
    AntdColor(
        primary = AntdColorMapToken(
            color = palette.blue6,
            bg = palette.blue1,
            bgHover = palette.blue2,
            border = palette.blue3,
            borderHover = palette.blue4,
            hover = palette.blue5,
            active = palette.blue7,
            text = palette.blue6,
            textHover = palette.blue5,
            textActive = palette.blue7
        ),
        success = AntdColorMapToken(
            color = palette.green6,
            bg = palette.green1,
            bgHover = palette.green2,
            border = palette.green3,
            borderHover = palette.green4,
            hover = palette.green5,
            active = palette.green7,
            text = palette.green6,
            textHover = palette.green5,
            textActive = palette.green7
        ),
        warning = AntdColorMapToken(
            color = palette.gold6,
            bg = palette.gold1,
            bgHover = palette.gold2,
            border = palette.gold3,
            borderHover = palette.gold4,
            hover = palette.gold5,
            active = palette.gold7,
            text = palette.gold6,
            textHover = palette.gold5,
            textActive = palette.gold7
        ),
        error = AntdColorMapToken(
            color = palette.red6,
            bg = palette.red1,
            bgHover = palette.red2,
            border = palette.red3,
            borderHover = palette.red4,
            hover = palette.red5,
            active = palette.red7,
            text = palette.red6,
            textHover = palette.red5,
            textActive = palette.red7
        ),
        info = AntdColorMapToken(
            color = palette.blue6,
            bg = palette.blue1,
            bgHover = palette.blue2,
            border = palette.blue3,
            borderHover = palette.blue4,
            hover = palette.blue5,
            active = palette.blue7,
            text = palette.blue6,
            textHover = palette.blue5,
            textActive = palette.blue7
        ),
        link = AntdColorMapToken(
            color = palette.blue6,
            bg = palette.blue1,
            bgHover = palette.blue2,
            border = palette.blue3,
            borderHover = palette.blue4,
            hover = palette.blue5,
            active = palette.blue7,
            text = palette.blue6,
            textHover = palette.blue5,
            textActive = palette.blue7
        ),
        textBase = palette.gray13,
        textSecondary = palette.gray13.copy(alpha = 0.65f),
        textTertiary = palette.gray13.copy(alpha = 0.45f),
        textQuaternary = palette.gray13.copy(alpha = 0.25f),
        textDisabled = palette.gray8,
        textInverse = palette.gray1,
        bgBase = palette.gray1,
        bgContainer = palette.gray1,
        bgElevated = palette.gray1,
        bgLayout = palette.gray3,
        bgSpotlight = palette.gray13.copy(alpha = 0.85f),
        bgMask = palette.gray13.copy(alpha = 0.45f),
        border = palette.gray5,
        borderSecondary = palette.gray4,
        fill = palette.gray13.copy(alpha = 0.15f),
        fillSecondary = palette.gray13.copy(alpha = 0.06f),
        fillTertiary = palette.gray13.copy(alpha = 0.04f),
        fillQuaternary = palette.gray13.copy(alpha = 0.02f)
    )

data class AntdColor(
    val primary: AntdColorMapToken,
    val success: AntdColorMapToken,
    val warning: AntdColorMapToken,
    val error: AntdColorMapToken,
    val info: AntdColorMapToken,
    val link: AntdColorMapToken,
    val textBase: Color,
    val textSecondary: Color,
    val textTertiary: Color,
    val textQuaternary: Color,
    val textDisabled: Color,
    val textInverse: Color,
    val bgBase: Color,
    val bgContainer: Color,
    val bgElevated: Color,
    val bgLayout: Color,
    val bgSpotlight: Color,
    val bgMask: Color,
    val border: Color,
    val borderSecondary: Color,
    val fill: Color,
    val fillSecondary: Color,
    val fillTertiary: Color,
    val fillQuaternary: Color,
)

data class AntdColorMapToken(
    val color: Color,
    val bg: Color,
    val bgHover: Color,
    val border: Color,
    val borderHover: Color,
    val hover: Color,
    val active: Color,
    val text: Color,
    val textHover: Color,
    val textActive: Color
)

