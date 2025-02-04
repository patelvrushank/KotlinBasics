fun main(){
oddNumbers()
}

fun oddNumbers(){
    val input:List<Int> = listOf(2,4,7,3,6,7,4,6,5)
    val result = input.filter { it %2 == 1 }
    println(result)

}