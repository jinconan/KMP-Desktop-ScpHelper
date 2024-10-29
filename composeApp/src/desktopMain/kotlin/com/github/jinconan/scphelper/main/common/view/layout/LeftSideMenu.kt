package com.github.jinconan.scphelper.main.common.view.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

val LeftSideMenu : @Composable (BoxScope.() -> Unit) =  {
  Box(
    modifier = Modifier
      .width(200.dp)
      .fillMaxHeight() // Row의 높이에 맞춰서 채움
      .background(Color.Gray) // 배경색을 통해 영역 구분
  ) {

    Text("Left Fixed", modifier = Modifier.align(Alignment.Center))
  }
}