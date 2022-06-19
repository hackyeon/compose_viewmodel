package com.hackyeon.compose_viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

class WellnessViewModel: ViewModel() {
    private val _tasks = getWellnessTasks().toMutableStateList()
    val tasks: List<WellnessTask> = _tasks

    fun remove(item: WellnessTask) {
        _tasks.remove(item)
    }

    fun changeTaskChecked(item: WellnessTask, checked: Boolean) = tasks.find { it.id == item.id }?.let { task ->
        task.checked = checked
    }

    private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }
}