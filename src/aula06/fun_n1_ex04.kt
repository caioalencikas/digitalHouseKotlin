package aula06

import kotlin.random.Random

fun main () {
    var rodada = 1
    var ponto = 0

    while (true) {
        println("Rolar dados? (s ou n)")
        val pergunta = readLine()!!.toUpperCase()
        if (pergunta == "N") {
            println("Saindo do jogo")
            break
        }

        val dados = rolarDados()
        println("Você tirou $dados")

        if (rodada == 1 && (dados == 7 || dados == 11)) {
            println("Natural, você ganhou")
            break
        } else if (rodada == 1 && (dados == 2 || dados == 3 || dados == 12)) {
            println("CRAPS, você perdeu")
            break
        } else if (rodada == 1){
            ponto = dados
            println("Seu ponto é $ponto Tire-o novamente para ganhar")
            rodada++
        } else if (dados == ponto) {
            println("Você ganhou")
            break
        } else if (dados == 7) {
            println("Tirou 7, você perdeu")
            break
        } else {
            rodada++
        }
    }


}

fun rolarDados() = Random.nextInt(2,12)