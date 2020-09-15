package aula05

fun main(){
    print("Informe a quantidade de CDs: ")
    val quantidadeCds = readLine()!!.toInt();
    var total =  0.0;

    for (x in 1..quantidadeCds){
        print("Informe o valor do cd número $x: ")
        val priceCd = readLine()!!.toDouble();
        total += priceCd
    }
    val media = total/quantidadeCds;

    println("O valor gasto com a coleção é de R$ $total");
    println("A média por CD é de R$ " + "%.2f".format(media));
}