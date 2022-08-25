fun main(){
    print("Digite a Altura em METROS da lata: ")
    val altura = readLine()!!.toInt()

    print("Digite o Raio em METROS da lata: ")
    val raio = readLine()!!.toInt()

    val v = volume(altura, raio)
    println("O Volume da sua lata é de: $v metros")
}

fun volume(altura: Int, raio: Int) = 3.14159 * (raio * raio) * altura
