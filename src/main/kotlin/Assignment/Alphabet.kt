package Assignment

fun main(){
    val alphabeth = 'x'
    println(alphabet(alphabeth))
}

fun alphabet(character:Char): String{
    val vowels = "AEIOU"
    for(letter in vowels){
        if(letter == character.uppercaseChar())
            return "$character is a vowel"
    }
    return "$character is a consonant"
}