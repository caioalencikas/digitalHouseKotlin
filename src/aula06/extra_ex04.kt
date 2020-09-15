package aula06

fun main() {
    var c = 0
    var num = 1
    while (true) {
        if (num % 2 != 0 && num > 0) {
            println(num)
            c++
        }
        if (c == 100) {
            break
        }
        num++
    }
}