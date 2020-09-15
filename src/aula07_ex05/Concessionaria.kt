package aula07_ex05

class Concessionaria(var veiculos:ArrayList<Veiculo>, var clientes:ArrayList<Cliente>, var vendas:ArrayList<Venda>) {

    fun registrarVenda(veiculo: Veiculo, cliente: Cliente, valor:Double) {
        val venda = Venda(valor, veiculo, cliente)
        vendas.add(venda)
    }
}