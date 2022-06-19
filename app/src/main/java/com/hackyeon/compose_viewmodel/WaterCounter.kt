package com.hackyeon.compose_viewmodel

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        var count by rememberSaveable { mutableStateOf(0) }
        if(count > 0) {
//            var showTask by remember { mutableStateOf(true) }
//            if(showTask) {
//                WellnessTaskItem(taskName = "task name", onClose = { showTask = false })
//            }
            Text(text = "my count: $count")
        }
//        Row(modifier = Modifier.padding(top = 8.dp)) {
            Button(modifier = Modifier.padding(top = 8.dp), onClick = { count++ }, enabled = count < 10) {
                Text(text = "add one")
            }
//            Button(onClick = { count = 0 }, Modifier.padding(start = 8.dp)) {
//                Text(text = "clear water count")
//            }
//        }
    }
}

@Composable
fun StatelessCounter(count: Int, onIncrement: () -> Unit, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        if(count > 0) {
            Text(text = "my count: $count")
        }
        Button(onClick = onIncrement, Modifier.padding(top = 8.dp), enabled = count < 10) {
            Text(text = "add one")
        }
    }
}

@Composable
fun StateFullCounter(modifier: Modifier = Modifier) {
    var waterCount by rememberSaveable { mutableStateOf(0) }
//    var juiceCount by rememberSaveable { mutableStateOf(0) }

//    Column() {
        StatelessCounter(count = waterCount, onIncrement = { waterCount++ }, modifier)
//        StatelessCounter(count = juiceCount, onIncrement = { juiceCount++}, modifier)
//    }

}