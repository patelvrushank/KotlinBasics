fun main(){
    println( caeserCipher("xyz",3))
}

fun caeserCipher(str:String,n:Int):String{
    val alphabets="abcdefghijklmnopqrstuvwxyz"
    var cipher = ""
    str.forEach {
        val index = alphabets.indexOf(it)
        val newIndex = (index + n) % alphabets.length
        cipher += alphabets[newIndex]
    }
    return cipher
}