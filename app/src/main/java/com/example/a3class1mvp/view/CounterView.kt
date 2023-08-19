package com.example.a3class1mvp.view

interface CounterView {
    fun showCount(number: Int)
    fun chaneColor(color: String)

    fun showToast(msg: String)
}