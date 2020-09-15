package aula05

fun main() {
    println("Digite um número: ")
    var numero = readLine()!!.toInt()
    if (numero % 2 == 0) {
        println("Número par")
    } else {
        println("Número ímpar")
    }
}