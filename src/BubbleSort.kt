fun main(){
    val list = listOf(4,7,2,2,4,1)
 println(bubbleSort(list))
}

fun bubbleSort(list:List<Int>):List<Int>{
    var sortedList = list.toMutableList()

    (0..sortedList.lastIndex).forEach { i->
        var swaped = false
        (0 until (sortedList.lastIndex-i)).forEach{
            j-> var element = sortedList[j]
            var nextElement = sortedList[j+1]

            if (element>nextElement){
                sortedList[j] = nextElement
                sortedList[j+1]= element
                swaped = true
            }
        }


    }
    return sortedList

}