package aula07_ex01

fun main() {
    var cliente1 = Cliente("Caio", "Alencikas")
    var cliente2 = Cliente("Marcos", "Silva")

    var conta1 = Conta(1,1250.50,cliente1)
    var conta2 = Conta(2,0.00,cliente2)

    println(conta1.saldo)
    conta1.deposito(250.00)
    println(conta1.saldo)
    conta1.saque(250.00)
    println(conta1.saldo)

    println(conta2.saldo)
    conta2.saque(250.00)
    println(conta2.saldo)
}