package aula06


fun main(){
    val numeros = ArrayList<Int>();

    for(num in 1..10){
        println("Digite um número")
        val numero = readLine()!!.toInt();

        numeros.add(numero);
    }

    numeros.reverse()
    for (num in numeros) {
        println(num)
    }
}