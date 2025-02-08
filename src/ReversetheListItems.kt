fun main(){
println(reverseList(listOf("vrushank","patel","palana","gujarat","india")))
}

fun reverseList(list:List<String>):List<String>{

    val newList = list.toMutableList()

    repeat(newList.size / 2){
        val temp = newList[it]
        val other = newList[newList.size - it - 1]
        newList[it] = other
        newList[newList.size - it - 1] = temp

    }

    return newList

}