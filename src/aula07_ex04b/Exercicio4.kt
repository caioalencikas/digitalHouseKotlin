package aula07_ex04b

fun main() {
    var meuFusca = Carro(15.0)
    meuFusca.adicionarGasolina(20.0)
    meuFusca.obterGasolina()
    meuFusca.andar(100000.0)
    meuFusca.obterGasolina()
    meuFusca.andar(100.0)
    meuFusca.obterGasolina()
}