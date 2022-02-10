package com.newu2012.doubletappcourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.math.pow

class SquaredActivity : AppCompatActivity() {
    private lateinit var squaredNumber: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_squared)
        setInitState()
    }

    private fun setInitState() {
        squaredNumber = findViewById(R.id.squaredNumber)
        squaredNumber.text =
            intent.getStringExtra("currentNumber").toString()
                .toDouble().pow(2)
                .toInt().toString()
    }
}