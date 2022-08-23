 fun main(){

     print("Digite o DIA em que você nasceu: ")
     val dia = readLine()!!.toInt()

     print("Digite o MÊS em que você nasceu: ")
     val mes = readLine()!!.toInt()

     print("Digite o ANO em que você nasceu: ")
     val ano = readLine()!!.toInt()


     println("Levando em consideração que todos os meses tem 30 dias...")

     val diasvividos = total(dia, mes, ano)
     println("Total de dias vividos: $diasvividos")



 }

 fun total(dia: Int, mes: Int, ano: Int) = dia + (mes * 30) + ((2022 - ano) * 365)