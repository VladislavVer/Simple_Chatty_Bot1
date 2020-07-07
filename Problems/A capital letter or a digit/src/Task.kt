import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val char = scanner.next().first()
    val isCapitalLetter = char.isLetter() && char.toUpperCase() == char
    val isOutNumber = char.isDigit() && char.dec().isDigit()
    val result = isCapitalLetter || isOutNumber
    println(result)
}