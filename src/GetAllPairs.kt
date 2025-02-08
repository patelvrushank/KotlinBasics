fun main(){
println(getAllPairs(2))
}
fun getAllPairs(n:Int):List<Pair<Int,Int>>{
    val result = mutableListOf<Pair<Int,Int>>()
    (0..n).forEach{
        i ->
        (0..n).forEach{
            j ->
            result.add(i to j)
        }
    }
    return result
}