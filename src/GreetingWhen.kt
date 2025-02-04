fun main(){
    val country = readLine()?.uppercase()
    when(country){
        "INDIA"-> println("Namaste")
        "USA" -> println("Hello")
        "GERMANY"-> println("Hallo")
        "SPAIN"-> println("Hola")
        else -> println("No such country")
    }
}