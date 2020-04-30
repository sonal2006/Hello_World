package com.nautilus.hello_world


/**
 * Created by sagrawal on 4/29/20.
 */

fun main(args: Array<String>) {

    val program = Program()
    program.addTwoNumbers(2, 7, object : MyInterface {   // Using Interface / OOPs way

        override fun execute(sum: Int) {
            println(sum)    // Body
        }
    })


    val myLambda: (Int) -> Unit = { s: Int -> println(s)}   // Lambda Expression [ Function ]
    program.addTwoNumbers(2, 7, myLambda)
}

class Program {

    fun addTwoNumbers(a: Int, b: Int, action: (Int) -> Unit) {  // High Level Function with Lambda as Parameter

        val sum = a + b
        action(sum)     // println(sum)
//        println(sum)  // Body
    }

    fun addTwoNumbers(a: Int, b: Int, action: MyInterface) {    // Using Interface / Object Oriented Way
        val sum = a + b
        action.execute(sum)
    }

}

interface MyInterface {
    fun execute(sum: Int)
    //Test with merge command
}

