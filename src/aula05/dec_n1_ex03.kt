package aula05

fun main() {
    println("Digite sua 1ª nota: ")
    val nota1 = readLine()!!.toFloat()
    println("Digite sua 2ª nota: ")
    val nota2 = readLine()!!.toFloat()
    val media = (nota1+nota2)/2
    if (media == 10f) {
        println("Aprovado com Distinção")
    } else if (media >= 7) {
        println("Aprovado")
    } else {
        println("Reprovado")
    }
}