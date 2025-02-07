
//Solution with loop
fun addUpTo(n:Int):Int{
    val i = 0
    var result:Int =0
    for(i in 0..n){
        result += i
    }
    return result
}
fun main(){
    println(addUpTo(5))
    println(addUpToRecursive(5))
}

//Solution with recursion
fun addUpToRecursive(n:Int):Int{
    if (n==1){
        return 1
    }
    return n + addUpToRecursive(n-1)
}