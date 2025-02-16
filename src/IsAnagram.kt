fun main() {
println("String are ${isAnagram("rail safety","fairy tales")} Anagram")
println("String are ${isAnagram("Hi there","Bye ther~ghbbnjnj 3")} Anagram")
}

fun isAnagram(str1:String, str2:String ):Boolean{
   return isCountMatch(str1) == isCountMatch(str2)


}
fun isCountMatch(str:String):Map<Char,Int>{
   return  str.lowercase()
       .filter { it.isLetterOrDigit() }
       .groupingBy { it }
       .eachCount()

}