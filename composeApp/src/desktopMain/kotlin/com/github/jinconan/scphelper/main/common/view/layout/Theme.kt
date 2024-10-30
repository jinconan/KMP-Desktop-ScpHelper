package com.github.jinconan.scphelper.main.common.view.layout

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun Theme(content: @Composable () -> Unit) {
  MaterialTheme(colors = MaterialTheme.colors,
    typography = MaterialTheme.typography,
    shapes = MaterialTheme.shapes,
    content = content)
}