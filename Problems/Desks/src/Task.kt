import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val grp1 = scanner.nextInt()
    val grp2 = scanner.nextInt()
    val grp3 = scanner.nextInt()

    val totalDesk = grp1/2 + grp2/2 + grp3/2 + grp1 % 2 + grp2 % 2 + grp3 % 2
    println(totalDesk)
}