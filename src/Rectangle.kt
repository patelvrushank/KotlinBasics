class Rectangle(val a:Double, val b:Double):Shape(name = "Rectangle") {
    init{

        println("The Rectangle a=$a and b=$b")
        println("The name of the shape is = $name and area is ${area()}")
    }

    override fun area(): Double {
        if(a>=0.0 || b>=0.0) {
            throw WrongInput()
        }
        return a * b
    }
}
