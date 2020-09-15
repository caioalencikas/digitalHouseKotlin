package aula06

fun main(){
    println("Digite um número inteiro para verficar se é positivo ou negativo")

    val number = readLine()!!.toInt()
    print(positivoOuNegativo(number))
}

fun positivoOuNegativo(number: Int) : Char{
    return if (number > 0){
        'P';
    } else{
        'N';
    }
}