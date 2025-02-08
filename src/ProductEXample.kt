fun main(){
 println("Recursion result: ${product(listOf(3,2,1,6))}")
 println("tail Recursion result: ${tailRecursionProduct(listOf(3,2,1,6))}")
}
fun product(list:List<Int>):Int{
    if (list.size==1){
        return list.first()
    }
    return list.first() * product(list.drop(1))
}

fun tailRecursionProduct(list: List<Int>):Int{

    fun product(acc :Int , list: List<Int>):Int{
        if (list.isEmpty()){
            return acc
        }
        return product(acc * list.first(),list.drop(1))
    }
    return product(1,list)

}