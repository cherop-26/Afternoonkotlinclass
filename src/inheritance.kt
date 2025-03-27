// Parent Class/Base class/Super class

open class Animal{

    var gender ="Male"
    var age =3

    fun makesound(){
        println("Animal is speaking")
    }

}

//Child class/Derived class/Sub class
class Dog:Animal(){
    fun bark(){
        println("Woof! Woof!")
    }

}//end of dog

class cat{
    var color = "white"
    var hasfurs = true

    fun meow(){
        println("Meow! Meow!")
    }
}// end of class cat

fun main() {
    var a = Animal()


    var d = Dog()



    var c = cat()
}

