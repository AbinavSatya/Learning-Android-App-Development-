fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}
//Function for Addition
fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

//Function for Subtraction
fun sub(num1: Int, num2: Int): Int {
    return num1 - num2
}