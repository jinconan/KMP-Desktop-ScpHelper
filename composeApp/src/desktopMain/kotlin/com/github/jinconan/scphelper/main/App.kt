package com.github.jinconan.scphelper.main

import androidx.compose.runtime.Composable
import com.github.jinconan.scphelper.main.common.view.layout.Content
import com.github.jinconan.scphelper.main.common.view.layout.Layout
import com.github.jinconan.scphelper.main.common.view.layout.LeftSideMenu
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    Layout(
        lnb = LeftSideMenu,
        content = Content
    )
}