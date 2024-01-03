fun main() {
    val amount = 14567
    val commissionPercentage = 0.0075
    val minCommission = 35

    val commission =
        if ((amount * commissionPercentage) < minCommission) {
            minCommission
        } else {
            (amount * commissionPercentage).toInt()
        }

    println("Ваша комиссия составляет: $commission")
}