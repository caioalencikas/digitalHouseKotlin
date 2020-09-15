package aula06


fun main(){
    println("Digite o preço do produto a ser taxado:");
    val precoBruto = readLine()!!.toDouble();

    println("Digite a taxa de imposto em porcentagem");
    val taxaImposto = readLine()!!.toDouble();

    val precoLiquido = precoBruto * taxaImposto + precoBruto

    println("O preço do produto após imposto é de: $precoLiquido")
}

fun somaImposto(taxaImposto: Double, precoBruto: Double) : Double{
    return precoBruto * (taxaImposto / 100);
}