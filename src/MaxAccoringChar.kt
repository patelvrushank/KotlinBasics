fun main() {
    println("Max occuring character is ${maxAccoringChar("vvkpatelaa")}")
}

fun maxAccoringChar(str:String):Char?{

    if(str.isBlank()) return null

    var map = mutableMapOf<Char, Int>()

    str.forEach {
        map[it] =(map[it]?: 0) +1
    }

    return map.maxBy { it.value }.key
}