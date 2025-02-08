fun main(){

    val lString:List<String> = listOf("my", "name","is","vrushank")
    val mString:String = "name"
    println(getIndex(lString,mString))
}

fun getIndex(listString:List<String>,stringM:String):Int{
    var resul = -1
    listString.forEachIndexed{ index, element ->
        if (element == stringM) {
            return index
        }
    }
    return resul
}