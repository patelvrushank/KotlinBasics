fun main(){
println(BinarySearchAlgo(listOf('a','b','c','d','e','f'),'h'))
}
fun BinarySearchAlgo(charList:List<Char>,char:Char):Int{
    var left = 0
    var right = charList.size - 1

    while (left<=right){
    val middle = (right + left) /2
        if(charList[middle] == char){
            return middle
        }
        else if(charList[middle]<char){
            left = middle + 1
        }
        else if (charList[middle]>char){
            right = middle - 1
        }
    }
    return -1
}