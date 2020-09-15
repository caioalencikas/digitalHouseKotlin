package aula07_ex02

class SessaoDeTreinamento(var experiencia:Int) {
    fun treinarA(jogador: JogadorDeFutebol) {
        if (jogador.energia >= 20) {
            var experienciaInicial = jogador.experiencia
            jogador.correr()
            jogador.fazerGol()
            jogador.correr()
            jogador.experiencia += experiencia
            var experienciaFinal = jogador.experiencia
            println("Jogador: ${jogador.nome}")
            println("Experiência inicial: $experienciaInicial")
            println("Experiência final: $experienciaFinal")
        } else {
            println("Não pode realizar a prova pois está muito cansado")
        }
    }
}