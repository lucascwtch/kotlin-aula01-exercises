package atividade02

fun main() {

    println("| Especificação | Código | Preço |" +
            "\n| Cachorro quente | 100 | 1,20 |" +
            "\n| Bauru simples | 101 | 1,30 |" +
            "\n| Bauru com ovo | 102 | 1,50 |" +
            "\n| Hambúrger | 103 | 1,20 |" +
            "\n| Cheeseburguer | 104 | 1,30 |" +
            "\n| Refrigerante | 105 | 1,00 |")

    print("Digite o CÓDIGO do LANCHE que deseja COMPRAR: ")
    val cod = readLine()!!.toInt()

    if(cod == 100){
        println("LANCHE ESCOLHIDO: Cachorro quente \nCÓDIGO:  100 \nPREÇO: R$1,20")

        println("Quantos deseja comprar?")
        val quant = readLine()!!.toInt()

        val total = quant * 1.20
        print("TOTAL A PAGAR: $total")

    }else if(cod == 101){
        println("LANCHE ESCOLHIDO: Bauru simples \nCÓDIGO:  101 \nPREÇO: R$1,30")

        println("Quantos deseja comprar?")
        val quant = readLine()!!.toInt()

        val total = quant * 1.30
        print("TOTAL A PAGAR: $total")

    }else if(cod == 102){
        println("LANCHE ESCOLHIDO: Bauru com ovo \nCÓDIGO:  102 \nPREÇO: R$1,50")

        println("Quantos deseja comprar?")
        val quant = readLine()!!.toInt()

        val total = quant * 1.50
        print("TOTAL A PAGAR: $total")

    }else if(cod == 103){
        println("LANCHE ESCOLHIDO: Hambúrger \nCÓDIGO:  103 \nPREÇO: R$1,20")

        println("Quantos deseja comprar?")
        val quant = readLine()!!.toInt()

        val total = quant * 1.20
        print("TOTAL A PAGAR: $total")

    }else if(cod == 104){
        println("LANCHE ESCOLHIDO: Cheeseburguer \nCÓDIGO:  104 \nPREÇO: R$1,30")

        println("Quantos deseja comprar?")
        val quant = readLine()!!.toInt()

        val total = quant * 1.30
        print("TOTAL A PAGAR: $total")

    }else if(cod == 105){
        println("LANCHE ESCOLHIDO: Cheeseburguer \nCÓDIGO:  105 \nPREÇO: R$1,00")

        println("Quantos deseja comprar?")
        val quant = readLine()!!.toInt()

        val total = quant * 1.00
        print("TOTAL A PAGAR: $total")

    }
}