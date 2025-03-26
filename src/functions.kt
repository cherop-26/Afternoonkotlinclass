fun main() {

    //standard library functions/pre-defined functions
   var output = Math.sqrt(144.0)
   println("The squareroot of 144 is $output")

    var number = Math.round(45.89)
    println(number)
    school() //*
    add()
    student("john","male",35)
    employees("ann",150000,true)

} // end of main


//User-defined functions
fun school(){
    println("eMobilis")
}

fun add(){
    var x = 3
    var y = 5
    println(x+y)
}


//Parameters/Variables and Arguments/Values
fun student(name:String,gender:String,age:Int){
    println("$name is a $gender.$name is $age years old")
}


//employees salary name disability
fun employees(name:String,salary:Int,disability:Boolean){
    println("$name earns $salary.Does $name have a disability? $disability")
}
