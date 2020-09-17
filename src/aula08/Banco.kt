package aula08

class Banco(private var contas: ArrayList<ContaBancaria>): iImprimivel {
    fun inserir(conta:ContaBancaria) {
        contas.add(conta)
        println("Conta criada com sucesso!")
        println("Seu número de conta é ${conta.numeroConta}")
    }

    fun remover(conta:ContaBancaria) {
        contas.remove(conta)
        println("Conta removida com sucesso")
    }

    fun procurarConta(numeroConta:Int): ContaBancaria? {
        for (c in contas) {
            if (c.numeroConta == numeroConta) {
                return c
            }
        }
        return null
    }

    fun mostrarContas() {
        for (c in contas) {
            c.mostrarDados()
        }
    }
}