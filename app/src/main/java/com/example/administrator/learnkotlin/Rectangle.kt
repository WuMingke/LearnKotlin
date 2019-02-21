package com.example.administrator.learnkotlin

/**
 * Created by Administrator on 2019/2/21.
 */
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
            /* get() {
                 return height == width
             }*/
        get() = height == width
}