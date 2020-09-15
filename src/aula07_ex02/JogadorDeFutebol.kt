package aula07_ex02

class JogadorDeFutebol(var nome:String, var energia: Int, var alegria: Int, var gols: Int, var experiencia: Int) {

    fun fazerGol(): Int {
        energia -= 5
        alegria += 10
        gols++
        println("GOOOOL!")
        return gols
    }

    fun correr(): Int {
        energia -= 10
        println("Cansei")
        return energia
    }


}