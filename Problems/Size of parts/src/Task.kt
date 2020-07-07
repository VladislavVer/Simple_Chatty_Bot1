import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val numberOfParts = scanner.nextInt()
    var numberOfFixParts = 0
    var numberOfRejectedParts = 0
    var numberOfReadyParts = 0
    repeat(numberOfParts) {
        val detectorResult = scanner.nextInt()
        if (detectorResult == 1) {
            numberOfFixParts++
        } else if (detectorResult == -1) {
            numberOfRejectedParts++
        } else if (detectorResult == 0) {
            numberOfReadyParts++
        }
    }

    print("$numberOfReadyParts $numberOfFixParts $numberOfRejectedParts")
}