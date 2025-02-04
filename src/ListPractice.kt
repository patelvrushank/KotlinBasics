fun main(){
    val myList = mutableListOf<Int>()

    for(i in 1..10){
        val x = readLine()?.toInt()
        if (x!=null){
            myList.add(x)
        }
    }
    println(myList)
}