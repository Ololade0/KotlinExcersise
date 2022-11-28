package Assignment

import java.util.*

fun main (){

    var reader = Scanner(System.`in`)

    print("Enter a number: ")
    var number = reader.nextInt()

    if(number % 2 != 0) {
        println(" $number  is an odd number")
    }
    else{
        println("$number is an even number")
    }
}