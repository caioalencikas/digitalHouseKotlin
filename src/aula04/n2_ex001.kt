package aula04

fun main() {
    print("Qual a temperatura(Fahrenheit) atual?")
    var grausF = +readLine()!!.toFloat()
    var grausC = 5 * ((grausF-32)/9)
    print("A temperatura atual em Celsius é ${"%.2f".format(grausC)}º")
}

