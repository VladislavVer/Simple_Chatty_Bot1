import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val firstRangeFrom = scanner.nextInt();
    val firstRangeTo = scanner.nextInt();
    val secondRangeFrom = scanner.nextInt();
    val secondRangeTo = scanner.nextInt();
    val checkedNumber =  scanner.nextInt();
    val result = checkedNumber in firstRangeFrom..firstRangeTo && checkedNumber in secondRangeFrom..secondRangeTo
    println(result)
}