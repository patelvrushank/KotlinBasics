abstract class Shape(val name:String) {

    constructor(name: String,vararg dimensions:Double):this(name)
    init {
        println("I ma a super class")
        println("The set name is $name ")
    }
    abstract fun area():Double
}