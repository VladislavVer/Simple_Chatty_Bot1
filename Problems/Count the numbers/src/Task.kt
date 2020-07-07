import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val n = scanner.nextInt()
    var divisibleBy = 0
    for (i in a..b){
        if(i % n == 0) divisibleBy+=1
    }
    println(divisibleBy)
}