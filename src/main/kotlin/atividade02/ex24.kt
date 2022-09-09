package atividade02

fun main(){
    print("Digite um número: ")
    val n1 = readLine()!!.toInt()

    if(n1 % 2 == 0){
        print("Número PAR!")
    }else if(n1 % 2 == 1){
        print("Número ÍMPAR!")
    }else{
        print("Inválido")
    }

}