fun main(){
    println(hasRepeatedCharacter("abcc"))
}

fun hasRepeatedCharacter(str:String):Boolean{

   val n = str.groupingBy { it }.eachCount()
    n.forEach{
        if (it.value>=2){
            return true
        }

    }
    return false
}