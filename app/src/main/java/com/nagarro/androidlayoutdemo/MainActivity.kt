package com.nagarro.androidlayoutdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.TransitionManager
import androidx.constraintlayout.widget.Placeholder
import androidx.constraintlayout.widget.ConstraintLayout





class MainActivity : AppCompatActivity() {
    private var layout: ConstraintLayout? = null
    private var placeholder: Placeholder? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        layout = findViewById(R.id.layout)
        placeholder = findViewById(R.id.placeholder)
    }

    fun swapView(view: android.view.View) {
//
        TransitionManager.beginDelayedTransition(layout)
        placeholder!!.setContentId(view.id)



    }
}