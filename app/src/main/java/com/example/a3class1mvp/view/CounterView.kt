package com.example.a3class1mvp.view

interface CounterView {
    fun showCount(number: Int)
    fun chaneColorGreen(color: String)
    fun chaneColorBlack(color: String)
    fun showToast(msg: String)
}