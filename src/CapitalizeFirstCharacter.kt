fun capitilizeFirstChar(){
  var input = readLine()
    var name = input?.split(" ")
        ?.joinToString(" ") { word ->
            word.replaceFirstChar { it.toUpperCase() }
        }
    println(name)
}

fun String.capitalizeFirstCharacter():String{
    return this.split(" ")
        .joinToString(" ") {
            word -> word.replaceFirstChar { it.toUpperCase() }
        }
}

fun main(){

    println("My name is vrushank patel".capitalizeFirstCharacter())
    capitilizeFirstChar()
}