fun main(){
   println(rangeContainsRange(2..10, 5..7))
}

fun rangeContainsRange(range1:IntRange, range2:IntRange):Boolean{
   return range1.first<= range2.first &&  range2.last <= range1.last
}