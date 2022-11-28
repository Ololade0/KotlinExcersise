package Assignment


fun main(){
    val char = 'D'
    println(charType(char))

}
fun charType(char: Char):String{
    if (char.isLetter())return "$char is an alphabet"
    return "$char is not an alphabet"
}
