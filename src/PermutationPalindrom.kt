fun main(){
    println( parmutationPatlindrom("Vrushank"))
    println( parmutationPatlindrom("ookvk"))
}

fun parmutationPatlindrom(str:String):Boolean{

    return str
        .groupBy { it }
        .map { it.value }
        .map { it.size }
        .count { it % 2 == 1} == 1

}