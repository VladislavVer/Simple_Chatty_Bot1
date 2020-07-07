import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val numberOne = scanner.nextInt()
    val numberTwo = scanner.nextInt()
    val numberThree = scanner.nextInt()
    val result = numberOne != numberTwo && numberOne != numberThree && numberTwo != numberThree
    println(result)
}