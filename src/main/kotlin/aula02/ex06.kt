fun main(){
    print("Digite o RAIO da circunferência: ")
    val raio = readLine()!!.toInt()

    val area = circ(raio)
    println("A ÁREA da circunferência é de: $area")
}

fun circ(raio: Int) = 3.14159 * (raio * raio)