package com.example.a3class1mvp

import android.graphics.Color
import android.view.View
import android.widget.Toast
import com.example.a3class1mvp.model.CounterModel
import com.example.a3class1mvp.view.CounterView

class Presenter {

    var model = CounterModel()
    lateinit var counterView: CounterView

    fun increment() {
        model.increment()
        counterView.showCount(model.number)
        update()
    }

    fun attachView(view: CounterView) {
        this.counterView = view
    }

    fun decrement() {
        model.decrement()
        counterView.showCount(model.number)
        update()
    }

    private fun update() {
        if (model.number == 10) {
           counterView.showToast("show MSG")
        } else if (model.number >= 15) {
            counterView.chaneColorGreen(model.colorGreen)

        } else {
            counterView.chaneColorGreen(model.colorBlack)

        }
    }

}