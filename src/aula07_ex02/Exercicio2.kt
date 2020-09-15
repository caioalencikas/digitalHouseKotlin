package aula07_ex02

fun main() {
    var jogador1 = JogadorDeFutebol("Ronaldinho", 50, 30, 0, 0)
    var jogador2 = JogadorDeFutebol("Kaka", 20, 0, 0, 5)

    var treinamento = SessaoDeTreinamento(10)
    treinamento.treinarA(jogador1)
    treinamento.treinarA(jogador2)

    println("${jogador1.nome}, ${jogador1.energia}, ${jogador1.alegria}, ${jogador1.gols} , ${jogador1.experiencia}")
    println("${jogador2.nome}, ${jogador2.energia}, ${jogador2.alegria}, ${jogador2.gols} , ${jogador2.experiencia}")
}