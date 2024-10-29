package com.github.jinconan.scphelper

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.github.jinconan.scphelper.main.App as MainApp
import com.github.jinconan.scphelper.example.App as ExampleApp

fun main(args: Array<String>) = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "ScpHelper",
    ) {

//        ExampleApp()
        MainApp()
    }
}