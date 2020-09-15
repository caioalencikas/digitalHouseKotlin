package aula07_ex04

class Tripe(var dobrado:Boolean, var alturaMinima:Float, var alturaMaxima:Float, var alturaAtual:Float) {

    fun definirAltura(novaAltura:Float) {
        alturaAtual = novaAltura
    }

    fun dobrar() {
        dobrado = true
    }

    fun desdobrar() {
        dobrado = false
    }

    fun guardar() {
        dobrado = true
        alturaAtual = alturaMinima
    }

    fun prontoParaGuardar():Boolean {
        return dobrado == true && alturaAtual == alturaMinima
    }

    fun usar() {
        dobrado = false
        alturaAtual = (alturaMaxima-alturaMinima)/2+alturaMinima
    }

    fun prontoParaUsar():Boolean {
        return dobrado == false && alturaAtual >= (alturaMaxima-alturaMinima)/2+alturaMinima
    }
}