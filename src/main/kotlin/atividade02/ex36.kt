package atividade02

fun main() {
    for (c in 0..100 step 5) {
        val f = convert(c)
        println("$c em CELSIUS convertido para FAHRENHEIT: $f")
    }
    println("Fim do Processamento!")
}

fun convert (c: Int) = (9 * c + 160) / 5
