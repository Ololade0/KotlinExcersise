package Functions

import java.util.*



fun main() {
    val reader = Scanner(System.`in`)

    print("Enter first number : ")
    val firstNUmber = reader.nextInt()

    print("Enter second number : ")
    val secondNUmber = reader.nextInt()

   val result =  addition(firstNUmber, secondNUmber)
    println("The sum is $result")

}

fun addition(n1: Int, n2: Int): Int {
    val sum = n1 + n2
    return sum.toInt()

}

