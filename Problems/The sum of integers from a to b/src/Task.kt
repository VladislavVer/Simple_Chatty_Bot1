import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var sum = 0
    for (i in scanner.nextInt()..scanner.nextInt()) sum+=i
    println(sum)
}
