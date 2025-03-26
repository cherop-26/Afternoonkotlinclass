//enter first and second,operator(+-*/),invalid operator
import java.util.Scanner
fun main() {

    var read = Scanner(System.`in`)

    println("Enter first number:")
    var num1 = read.nextInt()

    println("Choose operator : ( +,-,*,/) :")
    var operator = readln()

    println("Enter second number:")
    var num2 = read.nextInt()


    var answer= when (operator){
        "+" -> num1 +num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else->"INVALID OPERATOR"


    }
    println(" Answer is $answer")



}