package aula05


fun main(){
    println("Digite quantas notas quer cadastrar para calcular média")
    val quantidadeNotas = readLine()!!.toInt();
    var total = 0.0;
    var media = 0.0;

    for(i in 1..quantidadeNotas){
        println("Digite a nota");
        total += readLine()!!.toDouble();
    }
    media = total / quantidadeNotas;
    println("A média de $quantidadeNotas notas é de: " + "%.2f".format(media));
}