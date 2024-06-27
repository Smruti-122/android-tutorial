fun main() {
    val number = 371
    var temp = number
    var sum = 0
    var remainder: Int
    var digits = 0
    var org = number
    while (org != 0) {
        org /= 10
        digits++
    }
    temp = number
    while (temp != 0) {
        remainder = temp % 10
        var power = 1
        for (i in 1..digits) {
            power *= remainder
        }
        sum += power
        temp /= 10
    }

    if (number == sum) {
        println("it is an Armstrong number")
    } else {
        println("it isNot an Armstrong number")
    }
}
