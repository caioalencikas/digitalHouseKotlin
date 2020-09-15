package aula05

fun main() {
    println("Digite seu sexo: ")
    val sexo = readLine()!!.toUpperCase()
    if (sexo == "M") {
        println("M - Masculino")
    } else if (sexo == "F") {
        println("F - Feminino")
    } else {
        println("Sexo inválido")
    }
}