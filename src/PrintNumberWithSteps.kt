fun main(){
println(printNumberWithSteps(8,5))
}
fun printNumberWithSteps(n:Int, step:Int = 1):List<Int>{
    return (n downTo 0 step step).toList()
}