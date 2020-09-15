package aula05


fun main(){
    var classificacao = 0

    println("Use 'S' para sim e 'N' para não")

    println("Telefonou para a vítima? ")
    val pergunta1 = readLine()!!.toString()

    println("Esteve no local do crime? ")
    val pergunta2 = readLine()!!.toString()

    println("Mora perto da vítima? ")
    val pergunta3 = readLine()!!.toString()

    println("Devia para a vítima? ")
    val pergunta4 = readLine()!!.toString()

    println("Já trabalhou com a vítima? ")
    val pergunta5 = readLine()!!.toString()

    if(pergunta1.toUpperCase() == "S") {
        classificacao += 1
    }

    if(pergunta2.toUpperCase() == "S") {
        classificacao += 1
    }

    if(pergunta3.toUpperCase() == "S") {
        classificacao += 1
    }

    if(pergunta4.toUpperCase() == "S") {
        classificacao += 1
    }

    if(pergunta5.toUpperCase() == "S") {
        classificacao += 1
    }

    when (classificacao) {
        2 -> {
            print("Você é suspeito(a)")
        }
        in 3..4 -> {
            print("Você é cúmplice!")
        }
        5 -> {
            print("Você é o(a) assassino(a)!")
        }
        else -> {
            print("Você é inocente")
        }
    }
}