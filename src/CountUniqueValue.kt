fun main() {
    println(countUniqueValues(listOf(1, 4, 6,6,6,2, 6, 7, 4, 3, 2)))
}

fun countUniqueValues(list: List<Int>):Int {
    var result: Int
    var map = list.associate { it to it }
    println(map)
    return map.size

}