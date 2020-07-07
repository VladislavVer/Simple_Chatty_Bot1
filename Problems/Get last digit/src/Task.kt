import java.util.*
import kotlin.math.sign

// write your code here
fun getLastDigit(a: Int): Int = (a % 10) * a.sign

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    println(getLastDigit(a))
}
