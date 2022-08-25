fun main(){
    for(n in ordenar(10,50,1,7,9,23,40,32)){
        println("$n")
    }
}
fun ordenar(vararg numeros: Int): IntArray{
    return numeros.sortedArray()
}