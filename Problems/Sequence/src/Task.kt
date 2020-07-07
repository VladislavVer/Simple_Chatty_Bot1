import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val letterOne = scanner.next().first()
    val letterTwo = scanner.next().first()
    val letterThree = scanner.next().first()
    val resultCompareOrdering = letterOne ==  letterTwo.dec() && letterTwo ==  letterThree.dec()
    println(resultCompareOrdering)
}