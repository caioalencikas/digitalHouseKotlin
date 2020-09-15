package aula06

fun main(){
    println("Digite o primeiro número")
    val numero1 = readLine()!!.toInt()

    println("Digite o segundo número")
    val numero2 = readLine()!!.toInt()

    println("Digite o terceiro número")
    val numero3 = readLine()!!.toInt()

    val result = soma(numero1, numero2, numero3);

    print("A soma é $result");

}

fun soma(numero1: Int, numero2: Int, numero3: Int) : Int{
    return numero1 + numero2 + numero3;
}