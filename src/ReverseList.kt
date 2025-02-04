fun main(){
    val mylist = mutableListOf<Int>()

    for(i in 0..10){
        val itme = readLine()?.toInt()
        if(itme!=null){
            mylist.add(itme)
        }
    }
    for (i in mylist.size-1 downTo 0){
        println(mylist[i])
    }

}