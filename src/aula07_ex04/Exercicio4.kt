package aula07_ex04

fun main () {
    var tripe = Tripe(false, 1f, 2f, 1.5f)

    println(tripe.dobrado)
    tripe.dobrar()
    println(tripe.dobrado)
    tripe.desdobrar()
    println(tripe.dobrado)
    println(tripe.prontoParaGuardar())
    tripe.guardar()
    print(tripe.dobrado)
    print(tripe.alturaAtual)
    println(tripe.prontoParaGuardar())
    println(tripe.prontoParaUsar())
    tripe.usar()
    print(tripe.dobrado)
    print(tripe.alturaAtual)
    println(tripe.prontoParaUsar())
}

