import kotlin.math.min

fun main(){

println(selecyionSort(listOf(4,1,6,8,43,26,3,2,6,1)))
}

fun selecyionSort(list:List<Int>):List<Int>{
   val result = list.toMutableList()
    (0..result.lastIndex).forEach{ i->
        var minIndex = i
        (i..result.lastIndex).forEach{
            j ->
            if (result[j] < result[minIndex])
            {
                minIndex = j
            }
            if (minIndex!=i){
                val temp = result[i]
                result[i] = result [minIndex]
                result[minIndex] = temp
            }
        }
    }
    return result
}