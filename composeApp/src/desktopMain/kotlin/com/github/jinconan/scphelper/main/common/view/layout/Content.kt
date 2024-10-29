package com.github.jinconan.scphelper.main.common.view.layout

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

val Content : @Composable (BoxScope.() -> Unit) = {
  Box(
    modifier = Modifier
  ) {
    Text("Right Flexible", modifier = Modifier.align(Alignment.Center))
  }
}