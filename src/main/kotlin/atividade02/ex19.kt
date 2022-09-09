package atividade02

fun main(){

    print("Digite sua nota: ")
    val nota = readLine().toString().toDouble()

    if (nota in 9.0..10.0) {
        println("Nota excelente!")
    }else if (nota in 6.0..8.9){
        println("Aprovado!")
    }else if (nota in 4.0..5.9){
        println("Recuperação.")
    }else if (nota in 0.0..3.9){
        println("Reprovado.")
    }else {
        println("Nota inválida!")
    }
}