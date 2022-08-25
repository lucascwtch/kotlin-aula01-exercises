fun main(){

    print("Digite os graus em Celsius que deseja converter: ")
    val c = readLine()!!.toInt()

    val f = convert(c)
    println("Graus em Fahrenheit: $f")
}

fun convert (c: Int) = (9 * c + 160) / 5
