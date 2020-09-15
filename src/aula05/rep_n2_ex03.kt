package aula05

fun main(){
    println("Informe o valor que deseja ver a tabuada")
    val numero = readLine()!!.toInt();

    for(i in 0..10){
        println("$numero X $i = " + numero * i)
    }
}