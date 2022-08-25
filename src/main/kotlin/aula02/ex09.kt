fun main() {

    print("Digite o valor da VÁRIAVEL A: ")
    val vA = readLine()!!.toInt()

    print("Digite o valor da VÁRIAVEL B: ")
    val vB = readLine()!!.toInt()

    println("A = $vA")
    println("B = $vB")

    println("Trocando...")

    val tA = trocaA(vA, vB)
    println("Valor de A ATUAL: $tA")

    val tB = trocaB(vA, vB)
    println("Valor de B ATUAL: $tB")
}

fun trocaA(vA: Int, vB: Int) = vA + vB - vA
fun trocaB(vA: Int, vB: Int) = vB + vA - vB