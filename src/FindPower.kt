fun main(){
    println( power(1,1000))
}

fun power(base :Int, expo:Int):Int{
    if (expo== 1){
        return base
    }
    return base * power(base, expo-1)
}