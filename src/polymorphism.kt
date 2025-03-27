

open class shape{

    open fun draw(){
        println("Drawing a shape")
    }
}

class circle:shape(){
   override fun draw(){
        println("Drawing a circle")
    }
}//circle

class Rectangle:shape(){
    override fun draw(){
        println("Drawing a Rectangle")
    }
}//rectangle

fun main() {

    var sh = shape()
    sh.draw()

    var ci =circle()
    ci.


    var re = Rectangle()

}