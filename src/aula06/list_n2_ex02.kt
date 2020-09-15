package aula06

fun main() {
    var saque:Int
    do {
        println("Qual valor você deseja sacar? (Mínimo R$10,00 e máximo R$600,00)")
        saque = readLine()!!.toInt()
    } while (saque < 10 || saque > 600)

    val arrayNotas = arrayOf(100, 50, 10, 5, 1)
    val arrayQuantidade = Array(5) {_ -> 0}

    for (c in 0..4) {
        if (saque >= arrayNotas[c]) {
            arrayQuantidade[c] = (saque / arrayNotas[c]).toInt()
            saque -= arrayQuantidade[c] * arrayNotas[c]
            println("${arrayQuantidade[c]} notas de ${arrayNotas[c]}")
        }
    }
}