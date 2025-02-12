fun main(){

    println("Retrun the max occuraance of \"${maxOccurringChar("Vrushank Patel")}\"")
}

fun maxOccurringChar(str:String):Char?{
    if (str.isBlank()){
        return null
    }
    else
    {

        return str.toCharArray()
            .groupBy { it }
            .maxBy { it.value.size }
            .key
    }
}