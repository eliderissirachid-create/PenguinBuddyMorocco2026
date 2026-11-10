package com.penguinbuddy.morocco

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(Color.rgb(235, 220, 190))
            setPadding(24, 24, 24, 24)
        }

        val penguin = TextView(this).apply {
            text = "🐧"
            textSize = 100f
            gravity = Gravity.CENTER
        }

        val title = TextView(this).apply {
            text = "Penguin Buddy Morocco"
            textSize = 25f
            setTextColor(Color.rgb(90, 45, 25))
            gravity = Gravity.CENTER
        }

        val message = TextView(this).apply {
            text = "السلام عليكم! أنا بطريقك المغربي 🇲🇦"
            textSize = 20f
            setTextColor(Color.DKGRAY)
            gravity = Gravity.CENTER
            setPadding(0, 25, 0, 0)
        }

        layout.addView(penguin)
        layout.addView(title)
        layout.addView(message)

        setContentView(layout)
    }
}
