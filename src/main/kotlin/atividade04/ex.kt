fun main(){
    var A = Array<Int>(10,{i->i+1})
    var B = Array<Int>(10,{0})
    println("A - B")
    for(i in 0..9) {
        print(A.get(i))
        print(" - ")
        println((A.get(i) * 2).also { it.also { B[i] = it } })
    }
} 
