
fun main() {
    print("Digite o primeiro número: ")
    val a = readLine()!!.toInt()

    print("Digite o segundo número: ")
    val b = readLine()!!.toInt()

    val resultado = mult(a, b)
    println("O resultado da multiplicação é: $resultado")

}

fun mult(a: Int, b: Int) = a * b

