fun main(){

    print("Digite os graus em Fahrenheit que deseja converter: ")
    val c = readLine()!!.toInt()

    val f = ftoc(c)
    println("Graus em Celsius: $f")
}

fun ftoc (f: Int) = (f - 32) * 5 / 9
