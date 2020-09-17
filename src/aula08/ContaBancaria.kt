package aula08

abstract class ContaBancaria(public val numeroConta:Int, public var saldo:Double): iImprimivel {
    abstract fun sacar(dinheiro:Double): Boolean


    abstract fun depositar(dinheiro:Double): Boolean

    open fun mostrarDados() {
        println("Número da conta: $numeroConta")
        println("Saldo: $saldo")
    }

    fun transferir(valor: Double, contaDestino: ContaBancaria) {
        val saldoContaOrigem = saldo

        if (!sacar(valor) || !contaDestino.depositar(valor)) {
            saldo = saldoContaOrigem
            println("Operação cancelada")
        }
    }



}