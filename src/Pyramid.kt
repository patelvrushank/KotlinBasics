fun main(){

    print(pyramid(5))
}

fun pyramid(n:Int):MutableList<String>{
    val result = mutableListOf<String>()

    val maxRow = n * 2 - 1

    (1..n).forEach {
       val  rowLen = it * 2 - 1

       val sideString = ".".repeat((maxRow - rowLen) / 2)
        val hashString = "#".repeat(rowLen)

        result.add("$sideString$hashString$sideString")
    }
    return result

}