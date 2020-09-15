package aula04

fun main() {
    println("Digite o peso dos peixes: ")
    var peso = readLine()!!.toDouble()
    var excesso = 0.0
    if (peso > 50) {
        excesso = peso - 50
    }
    var multa = 4 * excesso.toInt()
    println("Excedeu $excesso Kg")
    println("O valor a ser pago é de R$ $multa")
}