import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val words: MutableList<String> = mutableListOf<String>()
    for (i in 1..5)
    {
        words.add(scanner.next())
    }
    for (word in words) {
        println(word)
    }

}