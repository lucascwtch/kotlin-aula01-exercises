package atividade02

fun main(){
    print("Digite um número: ")
    val n1 = readLine()!!.toString().toInt()

    print("Digite um número: ")
    val n2 = readLine().toString().toInt()

    print("Digite um número: ")
    val n3 = readLine().toString().toInt()

    for (n in ordenar(n1, n2, n3)) {
        println("$n ")
    }


}

fun ordenar(vararg numeros: Int): IntArray{
    return numeros.sortedArray()
}