package atividade02

fun main(){
    print("Digite um número para saber o fatorial: ")
    val n = readLine()!!.toInt()

    var fatorial: Long = 1

    for(i in 1..n){
        fatorial *= i.toLong()
    }
    println("Fatorial de $n = $fatorial")
}