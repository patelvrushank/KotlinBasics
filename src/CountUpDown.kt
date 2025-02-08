fun main(){
    println(countUpDown(1))
}

fun countUpDown(n:Int):MutableList<Int>{
    val list : MutableList<Int> = mutableListOf()
    for (i in 0..n)
    {
        list.add(i)
    }
    for(i in n-1 downTo 0){
        list.add(i)
    }
    return list
}