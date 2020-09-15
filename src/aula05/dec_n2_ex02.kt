package aula05


fun main(){
    print("Digite o valor do saque: ")
    val value = readLine()!!.toInt()

    val nota1: Int
    val nota5: Int
    val nota10: Int
    val nota50: Int
    val nota100: Int

    var quantidade: Int

    if(value >= 10 && value <= 600){
        nota100 = value / 100
        quantidade = value % 100

        nota50 = quantidade / 50
        quantidade = quantidade % 50

        nota10 = quantidade / 10
        quantidade = quantidade % 10

        nota5 = quantidade / 5
        quantidade = quantidade % 5

        nota1 = quantidade

        println("Serão fornecidas $nota100 notas de 100, $nota50 notas de 50, $nota10 notas de 10, $nota5 notas de 5 e $nota1 notas de 1")
    } else{
        println("Este valor não pode ser sacado")
    }
}