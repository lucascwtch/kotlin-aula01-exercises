package atividade03

fun main(){
    println("ESCOLHA UMA OPÇÃO: \n1 - SABER O FATORIAL DE UM NÚMERO \n2 - QUADRADO DE UM NÚMERO \n3 - VOLUME DE UMA LATA \n4 - SAIR DO APLICATIVO ")
    print("Escolha: ")
    val x = readLine()!!.toInt()
    when (x) {
        1 -> fatorial()
        2 -> quadrado()
        3 -> volume()
        4 -> sair()
        else -> {
            println("Opção inválida, tente novamente!")
        }
    }
}

fun fatorial() {
     println("Digite um número: ")
    val n = readLine()!!.toInt()
    var fatorial: Long = 1

    for(i in 1..n){
        fatorial *= i.toLong()
    }
   return println("Fatorial de $n = $fatorial")

}

fun quadrado(){
    println("Digite um número: ")
    val n = readLine()!!.toInt()

    val quad = (n * n)

    return println("Quadrado de $n é = $quad")
}

fun volume(){
    println("Digite a ALTURA da lata: ")
    val altura = readLine()!!.toInt()

    println("Digite o RAIO da lata: ")
    val raio = readLine()!!.toInt()

    val vol = 3.14159 * (raio * raio) * altura

    return println("Altura de $altura, Raio de $raio! O volume é de = $vol")
}

fun sair(){
    System.exit(0);
}

