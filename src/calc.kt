import java.util.*
import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    println("Enter two numbers")
    var number1 = sc.nextDouble()
    var number2 = sc.nextDouble()

    var output: Double=0.0

    val  b= true
    val arithmetic = Calculator()

    while(b) {
        println("Enter which operation to be performed")
        val operator = sc.next()
        when (operator) {
            "+" -> output = arithmetic.addition(number1,number2)
            "-" -> output = arithmetic.subtraction(number1,number2)
            "*" -> output = arithmetic.multiplication(number1,number2)
            "/" -> output = arithmetic.division(number1,number2)
            "%" -> output = arithmetic.modulus(number1,number2)

        }
        println("output of "+operator+" :" + output)
        println("enter another number")
        val new=sc.nextDouble()
        number1=output
        number2=new

    }


}
public class Calculator {


    fun addition(number1: Double, number2: Double): Double = number1 + number2

    fun subtraction(number1: Double, number2: Double): Double = number1 - number2

    fun multiplication(number1: Double, number2: Double): Double = number1 * number2

    fun division(number1: Double, number2: Double): Double = number1 / number2

    fun modulus(number1: Double, number2: Double): Double = number1 % number2

}