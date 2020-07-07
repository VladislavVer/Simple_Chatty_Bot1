import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val minHour = scanner.nextInt()
    val maxHour = scanner.nextInt()
    val annHour = scanner.nextInt()
    println(if (annHour in minHour..maxHour) {
        "Normal"
    } else if (annHour < minHour) {
        "Deficiency"
    } else if (annHour > maxHour) {

        "Excess"
    } else {
        ""
    }
    )
}