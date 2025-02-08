fun main() {

    println(capitalizeFirstCChar(listOf("vrushnak", "patel", "nirali", "patel")))
    println(decapitalizeString("VRUSHank"))
    println(longestString("my name is  niralipatel vushank"))
}

fun capitalizeFirstCChar(list: List<String>): List<String> {
    if (list.isEmpty()) {
        return emptyList()
    } else {
        return listOf(
            list.first().replaceFirstChar { string -> string.uppercaseChar() }) + capitalizeFirstCChar(list.drop(1))
    }
}

fun decapitalizeString(str:String):String{
    val subString = str.split("_")
        .map { it.lowercase() }
        .map { it.replaceFirstChar { string -> string.uppercaseChar() } }

    return subString.joinToString("")
        .replaceFirstChar { it.toLowerCase() }

}

fun longestString(str: String):String{
    return str.split(" ")
        .maxBy { it.length }
}