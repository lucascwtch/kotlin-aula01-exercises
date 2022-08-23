fun main(){
    print("Quanto você tem em DOLAR? ")
    val dol = readLine()!!.toDouble()

    print("Quanto está a COTAÇÃO do dolár hoje em dia? ")
    val cotacao = readLine()!!.toDouble()

    val totreal = real(dol, cotacao)
    println("Você tem R$$totreal REAIS!!")
}

fun real(dol: Double, cotacao: Double) = dol * cotacao