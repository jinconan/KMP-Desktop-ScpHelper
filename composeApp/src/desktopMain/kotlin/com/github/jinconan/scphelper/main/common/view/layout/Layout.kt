package com.github.jinconan.scphelper.main.common.view.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun Layout(lnb: @Composable (BoxScope.() -> Unit), content: @Composable (BoxScope.() -> Unit)) {
  Theme {
    Row(
      modifier = Modifier
        .fillMaxWidth() // Row의 너비를 100%로 설정
        .height(IntrinsicSize.Min) // Row의 높이를 콘텐츠에 맞춤
    ) {
      Box(
        modifier = Modifier
          .width(200.dp)
          .fillMaxHeight() // Row의 높이에 맞춰서 채움
          .background(Color.Gray) // 배경색을 통해 영역 구분
      ) {
        lnb()
      }

      // 오른쪽 영역 - 남은 전체 영역을 차지
      Box(
        modifier = Modifier
          .weight(1f) // 남은 공간을 모두 차지하도록 설정
          .fillMaxHeight()
          .background(Color.LightGray)
      ) {
        content()

      }
    }
  }

}