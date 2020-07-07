import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val durationInDays = scanner.nextInt()
    val totalFoodCostPerDay = scanner.nextInt()
    val oneWayFlightCost = scanner.nextInt()
    val costOfOneNightInHotel = scanner.nextInt()
    println(durationInDays * totalFoodCostPerDay + 2 * oneWayFlightCost + costOfOneNightInHotel*(durationInDays-1))
}