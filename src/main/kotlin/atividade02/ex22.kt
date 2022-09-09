package atividade02

fun main(){

    print("Digite o PRIMEIRO número: ")
    val n1 = readLine()!!.toInt()

    print("Digite o SEGUNDO número: ")
    val n2 = readLine()!!.toInt()

    print("Digite o TERCEIRO número: ")
    val n3 = readLine()!!.toInt()

    if (n1 > n2 ){
       if(n1 > n3) {
       print("Maior: $n1, PRIMEIRO número!")
       }else{
           print("Maior: $n3, TERCEIRO número!")
       }
    }else if (n2 > n1){
        if(n2 > n3){
            print("Maior: $n2, SEGUNDO número!")
        }else{
            print("Maior: $n3, TERCEIRO número!")
        }
    }

}