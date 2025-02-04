
fun main(){
    val a=3.0
    val b= -4.5
    val c= 3.0
    val rect = Rectangle(a,b)
    val newShape = object :Shape("parallelogram", a,b,c){
        init {
            println("The name of shape = $name and the area = ${area()}")
        }
        override fun area(): Double {
            return a*b*c
        }

    }
}
class WrongInput():Exception("The input is wrong")