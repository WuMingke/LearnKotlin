package com.example.administrator.learnkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // var max = max(2, 4)
        //val args:Array<String> = ["Bob",""]
        //main(args)
        val man = Person("Bob", "男")
        // println(man.name)
        Log.i("wmk", man.name)

    }

    fun max(a: Int, b: Int): Int = if (a > b) a else b

    fun main(args: Array<String>) {
        val name = if (args.size > 0) args[0] else "Kotlin"
        println("Hello,$name!")
    }

}
