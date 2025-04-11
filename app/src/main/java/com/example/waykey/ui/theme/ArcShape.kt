package com.example.waykey.ui.theme

import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

class ArcShape : androidx.compose.ui.graphics.Shape {
    override fun createOutline(
        size: androidx.compose.ui.geometry.Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        return Outline.Generic(Path().apply {
            val arcHeight = size.height * 0.2f
            val height = size.height
            val width = size.width

            moveTo(0f, height)
            lineTo(0f, arcHeight)
            quadraticBezierTo(
                width / 2, -arcHeight * 0.5f, // Control point (makes the arch)
                width, arcHeight // End point (right side)
            )
            lineTo(width, height)
            close()
        })
    }

}