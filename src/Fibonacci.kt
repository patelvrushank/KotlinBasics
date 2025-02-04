fun main()
{
    var x =0
    var y=1
    val myList= mutableListOf<Int>()
    val n = readLine()?.toInt()
    myList.add(x)
    myList.add(y)
    if(n!=null){
        for(i in 1..n-2){
            var itme =x+y
            x=y
            y=itme
           myList.add(itme)
        }
    }
    println(myList)

}