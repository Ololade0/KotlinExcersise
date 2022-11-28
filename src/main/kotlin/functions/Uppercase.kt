package functions


class Letter{
    infix fun letter(n: String): String {
        return n.uppercase()
    }
}

fun main(args: Array<String>){
    val m = Letter()
    val result = m letter "ololade"
    println("The uppercase of the letter is : $result")
}