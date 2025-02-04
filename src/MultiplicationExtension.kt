fun main(){
    val values = intArrayOf(1,2,3,4,5,6)
    val result =values.multiplication()
    println("The multiplication of the intArray is = $result")

}
fun IntArray.multiplication():Int{
    var result = 1
    for(i in this){
        result *= i
    }
    return result

}