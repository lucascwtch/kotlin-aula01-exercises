package aula03

fun main(){
    val nota: Double = 5.3
//    if(nota >= 7.0){
////        println("Aprovado")
////    }else {
////        println("Reprovado")
////    }

    if (nota in 9.0..10.0) {
        println("Nota excelente!")
    }else if (nota in 6.0..8.9){
        println("Aprovado!")
    }else if (nota in 4.0..5.9){
        println("Reavaliação...")
    }else if (nota in 0.0..3.9){
        println("Reprovado.")
    }else {
        println("Nota inválida!")
    }
}