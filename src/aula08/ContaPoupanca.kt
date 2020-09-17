package aula08

class ContaPoupanca(numeroConta:Int, saldo:Double, private val limiteCredito:Double): ContaBancaria(numeroConta,  saldo) {
    override fun sacar(dinheiro:Double): Boolean {
        if (dinheiro > saldo+limiteCredito) {
            println("Não é permitido sacar")
            return false
        } else {
            saldo -= dinheiro
            println("Saque feito")
            return true
        }
    }

    override fun depositar(dinheiro:Double): Boolean {
        println("Depósito feito")
        saldo += dinheiro
        return true
    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Limite de crédito: $limiteCredito")
    }
/*
    override fun transferir(valor:Double, conta: ContaBancaria) {
        if (this.saldo >= valor) {
            this.sacar(valor)
            conta.depositar(valor)
        } else {
            println("Essa não transferência não pode ser feita")
        }
    }

 */
}