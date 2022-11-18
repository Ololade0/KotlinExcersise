import java.util.*

fun main (){

    var reader = Scanner(System.`in`)

    print("Enter a number: ")
    var number = reader.nextInt()

    if(number % 2 != 0) {
        println("It is an odd number")
    }
    else{
        println("It is an even number")
    }
}