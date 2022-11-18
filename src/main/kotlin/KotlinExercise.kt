import java.util.Scanner

fun main(){
    val reader = Scanner(System.`in`)


    val secondInteger = 10
    val thirdInteger = 20
    val firstFloatingNumner = 5
    val secondFloatingNumber = 10


    println("Enter an Integer: ")
    var integer = reader.nextInt()


    integer+= secondInteger + thirdInteger
    println("The sum is $integer")


    var multiplication = firstFloatingNumner * secondFloatingNumber

    var multiplResult = multiplication * integer
    println("The multiplication is: $multiplResult")


    if((multiplResult % 2) == 0){
         println("The remainder is equal to zero")
     }
     else{
         println("The remaider is not equal to zero")

    }

//    integer*= firstFloatingNumner * secondFloatingNumber

}