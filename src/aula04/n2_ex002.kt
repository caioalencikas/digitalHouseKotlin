package aula04

fun main() {
    print("Quanto você ganha por hora?")
    var salarioHora = readLine()!!.toDouble()
    print("Quantos horas você trabalha por mês?")
    var horasMes = readLine()!!.toInt()

    var salarioBruto = salarioHora * horasMes
    var inss = salarioBruto * 0.08
    var sindicato = salarioBruto * 0.05
    var impostoRenda = salarioBruto * 0.11
    var salarioLiquido = salarioBruto - sindicato - impostoRenda - inss

    print("+ Salário Bruto : R\$$salarioBruto \n")
    print("- IR (11%) : R\$$impostoRenda \n")
    print("- INSS (8%) : R\$$inss \n")
    print("- Sindiacto (5%) : R\$$sindicato \n")
    print("= Salário Líquido : R\$$salarioLiquido \n")
}

