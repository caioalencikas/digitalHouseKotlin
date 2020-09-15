package aula06

fun main(){
    val alturas = ArrayList<Double>();

    for(num in 1..5){
        println("Digite sua altura:")
        val altura = readLine()!!.toDouble();

        alturas.add(altura);
    }

    alturas.reverse()
    for (altura in alturas) {
        println(altura)
    }
}