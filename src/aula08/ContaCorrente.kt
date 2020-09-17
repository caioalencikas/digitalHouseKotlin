package aula08

class ContaCorrente(numeroConta:Int, saldo:Double, private val taxaDeOperacao:Double): ContaBancaria(numeroConta,  saldo) {
    override fun sacar(dinheiro:Double): Boolean {
        if (dinheiro + taxaDeOperacao > saldo) {
            println("Não é permitido sacar")
            return false
        } else {
            saldo -= dinheiro
            saldo -= taxaDeOperacao
            println("Saque feito")
            return true
        }
    }

    override fun depositar(dinheiro:Double): Boolean {
        if (saldo + dinheiro <=  taxaDeOperacao) {
            println("Não pode fazer esse depósito")
            return false
        } else {
            saldo += dinheiro
            saldo -= taxaDeOperacao
            println("Depósito feito")
            return true
        }
    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Taxa de operação: $taxaDeOperacao")
    }
/*
    override fun transferir(valor:Double, conta: ContaBancaria) {
        if (this.saldo >= taxaDeOperacao + valor && conta.saldo + valor >= taxaDeOperacao) {
            this.sacar(valor)
            conta.depositar(valor)
        } else {
            println("Essa não transferência não pode ser feita")
        }
    }
    */

}