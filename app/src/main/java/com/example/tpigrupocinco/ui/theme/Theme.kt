package com.example.tpigrupocinco.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = ColorPrimary,
    secondary = ColorSecondary,
    tertiary = ColorTertiary,
    surface = ColorWhite,
    background = ColorWhite,
    onPrimary = ColorWhite,
    onSecondary = ColorBlack,
    onSurface = ColorBlack,
)

@Composable
fun AlayaTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,
        content = content
    )
}