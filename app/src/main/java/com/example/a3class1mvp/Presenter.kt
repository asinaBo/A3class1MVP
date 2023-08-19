package com.example.a3class1mvp

import com.example.a3class1mvp.model.CounterModel
import com.example.a3class1mvp.view.CounterView

class Presenter {

    var model = CounterModel()
    lateinit var counterView: CounterView

    fun increment() {
        model.increment()
        counterView.update(model.number)
        counterView.showCount(model.number)
    }

    fun attachView(view: CounterView) {
        this.counterView = view
    }

    fun decrement() {
        model.decrement()
        counterView.update(model.number)
        counterView.showCount(model.number)
    }

}