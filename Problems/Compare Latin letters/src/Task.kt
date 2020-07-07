import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine()
    val letterOne:Char = input[0]
    val letterTwo:Char = input[2]
    println(letterOne.toLowerCase() == letterTwo.toLowerCase())
}