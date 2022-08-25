fun main(){
    print("Digite um número: ")
    val n1 = readLine()!!.toInt()


    val div = n1 % 6
    println("Número digitado: $n1 | Resto da divisão por 6 é: $div")
}