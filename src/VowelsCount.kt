fun main(
){
println(findVowels("Vrushank"))
println(findVowels("Nirali"))

}

fun findVowels(str:String):Int{
    val vowel = mutableListOf("a","e","i","o","u","y")
    if (str.isEmpty()){
        return 0
    }
    else{
        return str.count{
            it.lowercase() in vowel
        }
    }
}