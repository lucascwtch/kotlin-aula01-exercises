package aula03

fun main(){
    //  :: chama uma função como parametro
    println("Somando: " + calcular(5, 7, :: somar)) // + calcular(2, 6, :: somar))
    println("Subtraindo: " + calcular(5, 7, :: subtrair))
    println("Multiplicando: " + calcular(5, 7, :: multiplicar))
}
fun somar(a: Int, b: Int): Int{
    return a + b
}

fun subtrair(a: Int, b: Int): Int{
    return a - b
}

fun multiplicar(a: Int, b: Int): Int{
    return a * b
}

fun calcular(a: Int, b: Int, funcao: (Int, Int) -> Int): Int{
    return funcao(a,b)
}