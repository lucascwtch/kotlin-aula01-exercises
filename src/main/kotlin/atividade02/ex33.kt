package atividade02

fun main(){

    val num = 100
    var soma = 0

    for (i in 1..num) {
        soma += i
    }
    println("Soma de todos os números até o 100 = $soma")
}