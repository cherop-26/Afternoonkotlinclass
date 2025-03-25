import java.util.Scanner

// three numbers,variables,return which is which in terms of value
fun main() {
    
    var read = Scanner(System.`in`)
    println("Enter first number:")
    var num1 = readln()


    println("Enter second number:")
    var num2 = readln()

    println("Enter third number:")
    var num3 = readln()

    if (num1>num2 && num1>num3){
        println("$num1 is the largest number")}
    else if (num2>num1 && num2>num3){
        println("$num2 is the largest number")
    }
    else {
        println("$num3 is the largest number")
    }



    
    
    
    
}