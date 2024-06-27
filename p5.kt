fun main() {
    val number = 12030
    var num = number
    var isDuck = true
    
    while (num > 0) {
        val digit = num % 10
        if (digit == 0) {
            isDuck = false
            break
        }
        num /= 10
    }
    
    if (isDuck) {
        println("$number is not duck")
    } else {
        println("$number is duck")
    }
}
