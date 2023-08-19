package com.example.a3class1mvp.model

import android.graphics.Color
import android.widget.Toast

class CounterModel {
    var number = 0
    var colorGreen = "#4CAF50"
    var colorBlack = "#FF000000"

    fun increment(){
        number++
    }
    fun decrement(){
        number--
    }
}