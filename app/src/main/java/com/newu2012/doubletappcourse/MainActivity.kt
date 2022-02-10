package com.newu2012.doubletappcourse

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val _currentNumber = "currentNumber"

    private lateinit var currentNumber: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setInitState()
    }

    private fun setInitState() {
        currentNumber = findViewById(R.id.currentNumber)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        print("hm")
        incrementNumber()
    }

    private fun incrementNumber() {
        val currentString = currentNumber.text.toString()
        var parsedString = Integer.parseInt(currentString)
        parsedString++
        currentNumber.text = parsedString.toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(_currentNumber, currentNumber.text.toString().toInt())
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        currentNumber.text = savedInstanceState.getInt(_currentNumber).toString()
        super.onRestoreInstanceState(savedInstanceState)
    }
}