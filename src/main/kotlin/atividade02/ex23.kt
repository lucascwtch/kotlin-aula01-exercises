fun main(){
    var maior:Int = 0
    var menor:Int = 0
    for (i in 0..4){
        println("Digite um número: ")
        var num = readLine().toString().toInt();
        if(i == 0){
            maior = num
            menor = num
        }else{
            if(num > maior){
                maior = num
            }
            if(num < menor){
                menor = num
            }
        }
    }
    println("Maior:$maior\nMenor:$menor")

}