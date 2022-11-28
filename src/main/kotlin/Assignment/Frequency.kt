package Assignment

import functions.Letter

fun main(){
val letter = "Ololade"
    var charCount = frequency(letter, character = 'o')
    println("The number of letter 'a' in $letter is $charCount")
}
fun frequency(letter: String, character:Char): Int {
    var charCount = 0
    for (letters in letter) {
        if (letters == character) charCount++

    }
    return charCount

}