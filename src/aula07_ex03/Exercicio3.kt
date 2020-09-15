package aula07_ex03

fun main() {
    var atleta1 = Atleta("Pedro", 3, 20)
    var atleta2 = Atleta("João", 1, 5)

    var prova1 = Prova(1, 5)
    var prova2 = Prova(3, 10)
    var prova3 = Prova(1, 6)

    println(prova1.realizarProva(atleta1))
    println(prova1.realizarProva(atleta2))
    println(prova2.realizarProva(atleta1))
    println(prova2.realizarProva(atleta2))
    println(prova3.realizarProva(atleta1))
    println(prova3.realizarProva(atleta2))

}