package aula08

import kotlin.random.Random

fun main() {
    val banco = Banco(ArrayList<ContaBancaria>())


    while(true) {
        println("Menu - Banco Santander")
        println("1 - Criar conta")
        println("2 - Selecionar conta")
        println("3 - Remover conta")
        println("4 - Gerar relatório")
        println("5 - Finalizar")
        val respostaMenu = readLine()!!.toInt()

        when (respostaMenu) {
            1 -> {
                println("Qual o tipo da conta?")
                println("1 = Conta Corrente")
                println("2 = Conta Poupança")
                val tipoConta = readLine()!!.toInt()
                var numeroConta = Random.nextInt(0, 999999)

                while (banco.procurarConta(numeroConta) != null) {
                    numeroConta = Random.nextInt(0, 999999)
                }

                if (tipoConta == 1) {
                    val conta = ContaCorrente(numeroConta, 0.0, 5.0)
                    banco.inserir(conta)
                } else if (tipoConta == 2) {
                    val conta = ContaPoupanca(numeroConta, 0.0, 500.0)
                    banco.inserir(conta)
                }

            }
            2 -> {
                println("Qual o número da sua conta?")
                val numeroConta = readLine()!!.toInt()
                val conta = banco.procurarConta(numeroConta)
                if (conta != null) {
                    println("a = Depositar")
                    println("b = Sacar")
                    println("c = Transferir")
                    println("d = Gerar relatório")
                    println("e = Retornar ao menu anterior")
                    val respostaMenu2 = readLine()!!.toLowerCase()

                    when (respostaMenu2) {
                        "a" -> {
                            println("Qual valor?")
                            val valor = readLine()!!.toDouble()
                            conta.depositar(valor)
                        }
                        "b" -> {
                            println("Qual valor?")
                            val valor = readLine()!!.toDouble()
                            conta.sacar(valor)
                        }
                        "c" -> {
                            println("Qual valor?")
                            val valor = readLine()!!.toDouble()
                            println("Qual o número da conta que deseja transferir?")
                            val numeroContaDestino = readLine()!!.toInt()
                            val contaDestino = banco.procurarConta(numeroContaDestino)
                            if (contaDestino != null) {
                                conta.transferir(valor, contaDestino)
                            } else {
                                println("Conta destino inexistente")
                            }
                        }
                        "d" -> {
                            val relatorio = Relatorio()
                            relatorio.gerarRelatorio(conta)
                        }
                        "e" -> {
                            print("Retornar ao menu anterior")
                        }
                    }

                } else {
                    println("Conta inexistente")
                }
            }
            3 -> {
                println("Qual o número da sua conta?")
                val numeroConta = readLine()!!.toInt()
                val conta = banco.procurarConta(numeroConta)
                if (conta != null) {
                    banco.remover(conta)
                } else {
                    println("Conta inexistente")
                }
            }
            4 -> {
                banco.mostrarContas()
            }
            5 -> {
                println("Muito obrigado, volte sempre!")
                break
            }
            else -> {
                println("Valor incorreto")
            }
        }
    }
}