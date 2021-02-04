package com.codingfanatic.kotlinhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    fun main() {
        val border = %
        printBorder(border)
        println("Happy Birthday, Richard!")
        printBorder(border)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
 