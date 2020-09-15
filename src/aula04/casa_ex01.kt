package aula04

fun main() {
    print("Digite a nota do 1º bimestre:")
    var nota1 = readLine()!!.toFloat()
    print("Digite a nota do 2º bimestre:")
    var nota2 = readLine()!!.toFloat()
    print("Digite a nota do 3º bimestre:")
    var nota3 = readLine()!!.toFloat()
    print("Digite a nota do 4º bimestre:")
    var nota4 = readLine()!!.toFloat()
    var media = (nota1 + nota2 + nota3 + nota4)/4
    print("A média é $media")
}

