package aula07_ex01

class Conta(var numeroConta:Int, var saldo:Double, var titular:Cliente) {

    fun deposito(dinheiro:Double):Double {
        this.saldo += dinheiro
        println("Depósito realizado")
        println("Novo saldo: " + "%.2f".format(saldo))
        return saldo
    }

    fun saque(dinheiro:Double):Double {
        if (dinheiro > saldo) {
            println("Saldo insuficiente")
        } else {
            this.saldo -= dinheiro
            println("Saque realizado")
            println("Novo saldo: " + "%.2f".format(saldo))
        }
        return saldo
    }
}