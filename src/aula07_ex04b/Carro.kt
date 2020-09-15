package aula07_ex04b

class Carro(var consumo:Double) {
    var combustivel:Double = 0.0

    fun andar(quilometros:Double) {
        val gastoCombustivel = quilometros/consumo

        if (combustivel >= gastoCombustivel) {
            println("Você pode fazer essa viagem")
            combustivel -= gastoCombustivel
        } else {
            println("Você não pode fazer essa viagem")
        }
    }

    fun adicionarGasolina(litros:Double) {
        combustivel += litros
    }

    fun obterGasolina() {
        println(combustivel)
    }
}