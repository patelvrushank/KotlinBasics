fun main(){
    println(fizzBuzz(20))
}

fun fizzBuzz(n:Int):List<String>{
    val result = mutableListOf<String>()

    (1..n).forEach {
        val item = when{
            it % 3 == 0 && it % 5 == 0 ->"FizzBuzz"
            it % 3 == 0 ->"Fizz"
            it % 5 == 0 ->"Buzz"
            else -> it.toString()
        }
        result.add(item)
    }
    return result
}