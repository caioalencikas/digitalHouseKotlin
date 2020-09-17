package aula08

fun main() {
    val contaCorrente = ContaCorrente(1, 500.0, 5.0)
    val contaPoupanca = ContaPoupanca(2, 500.0, 500.0)

    contaCorrente.depositar(500.0)
    contaPoupanca.depositar(500.0)

    contaCorrente.sacar(1500.0)
    contaCorrente.sacar(990.0)

    contaPoupanca.sacar(2000.0)
    contaPoupanca.sacar(1500.0)

    val relatorio = Relatorio()

    relatorio.gerarRelatorio(contaCorrente)
    relatorio.gerarRelatorio(contaPoupanca)



}