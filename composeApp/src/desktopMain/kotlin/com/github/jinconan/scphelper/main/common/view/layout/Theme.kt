package com.github.jinconan.scphelper.main.common.view.layout

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

val colors = MaterialTheme.colors
val typography = MaterialTheme.typography
val shapes = MaterialTheme.shapes

@Composable
fun Theme(content: @Composable () -> Unit) {
  MaterialTheme(colors = colors,
    typography = typography,
    shapes = shapes,
    content = content)
}