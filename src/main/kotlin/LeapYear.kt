import java.util.*

fun main () {

    var reader = Scanner(System.`in`)

    print("Enter a Year: ")
    var year = reader.nextInt()

    if(year % 4 == 0){
        println("$year is a leap year")
    }

    if(year % 4 !=  0){
        println("$year is not a  leap year")
    }


}