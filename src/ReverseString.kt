fun main(){
    println(
        "Reverse String of vrushank is ${reverse("vrushank")}"
    )
}

fun reverse(str:String):String{

    if (str.isEmpty()){
        return str
    }
    else{
        return reverse(str.drop(1)) + str.first()
    }

}