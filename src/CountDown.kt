fun main(){
    println( countDown(5))
}

fun countDown(n:Int):MutableList<Int>{
    val list: MutableList<Int> = mutableListOf()
      for(i in n downTo 0){
        list.add(i)
    }
    return list
}