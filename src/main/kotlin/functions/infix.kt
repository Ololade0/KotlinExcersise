package functions

class math {
    infix fun square(n: Int): Int {
        return n * n
    }
}

fun main(args: Array<String>){
    val m = math()
    val result = m square 3
    println(m)
    println("The square of a number is: $result")
}


