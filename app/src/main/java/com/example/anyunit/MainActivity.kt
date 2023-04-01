package com.example.anyunit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val value1: Any = 10
        var value2: Any = "Hello"
        println("${value1}")
        println("${value2}")

        // 생략도 가능하다. 생략하면 기본 반환값 없는 함수와 형식이 같음.
        fun people(year: Int): Unit {
            val age = 2023 - year
            Log.d("people함수", "반환값이 없는 함수의 age는 ${age}살 ")
        }

        people(1991)

    }
}