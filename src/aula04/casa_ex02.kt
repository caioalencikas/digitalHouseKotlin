package aula04

fun main() {
    print("Quanto você ganha por hora?")
    val salarioHora = readLine()!!.toDouble()
    print("Quantos horas você trabalha por mês?")
    val horasMes = readLine()!!.toInt()

    val salarioBruto = salarioHora * horasMes

    print("Você receberá R$ $salarioBruto")

}