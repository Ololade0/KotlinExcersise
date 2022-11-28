package functions

fun displayBorder(character: Char = '*', length: Int = 15){
    for(i in 1..length){
        println(character)

    }
}
fun main(args: Array<String>){
    println("Output when no arguement is passed")
    displayBorder()

    println("Is used as a first arguement")
    println(" 5 Is used as a first arguement")
    print("Output when both arguement is passed")
    displayBorder('*', 5)

}