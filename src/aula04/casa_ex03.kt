package aula04

fun main() {
    println("Qual a sua altura?")
    var altura = readLine()!!.toFloat()

    var pesoHomem = (72.7 * altura) - 58
    var pesoMulher = (62.1 * altura) - 44.7

    println("Para homens: $pesoHomem")
    println("Para mulheres: $pesoMulher")

}