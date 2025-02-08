fun main(){
println("Factorial is ${factorial(0)}")
    println("Recursion factorial is ${factorialRecursion(0)}")
}

fun factorial(n:Int):Int{

    fun fact(number: Int, acc:Int= 1):Int =
        when(number){
            0,1 -> acc
            else -> fact(number - 1, acc * number)
        }

    return fact(n)
}

fun factorialRecursion(number: Int):Int{
    if (number <=1){
        return 1
    }
    return number * factorial(number-1)
}