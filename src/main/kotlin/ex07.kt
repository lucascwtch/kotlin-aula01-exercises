fun main() {
    print("Digite o VALOR da prestação: ")
    val valor = readLine()!!.toDouble()

    print("Digite a TAXA da prestação: ")
    val taxa = readLine()!!.toInt()

    print("Digite a QUANTIDADE DE PRESTAÇÕES: ")
    val tempo = readLine()!!.toInt()

    val ewe = prest(valor, taxa, tempo)
    println("O Total da prestação foi de: $ewe")
}

fun prest(valor: Double, taxa: Int, tempo: Int) = valor + (valor * taxa / 100) * tempo