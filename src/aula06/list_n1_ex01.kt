package aula06

fun main(){
    val numeros = ArrayList<Int>();

    for(num in 0..4){
        println("Digite um número")
        val numero = readLine()!!.toInt();

        numeros.add(numero);
    }

    for (num in numeros) {
        println(num)
    }
}