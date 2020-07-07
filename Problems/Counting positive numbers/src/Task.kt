import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val size = scanner.nextInt()
    var countPositiveNumbers = 0
    repeat(size){
        countPositiveNumbers += if (scanner.nextInt() > 0) {
            1
        } else {
            0
        }
    }
    print(countPositiveNumbers)
}