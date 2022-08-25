package aula03

import java.util.*

fun main() {
    val (h, m, s) = agora()
    println("$h:$m:$s")
}

data class Horario(
    val hora: Int,
    val minutos: Int,
    val segundo: Int
)

fun agora(): Horario {
    val agora = Calendar.getInstance()
    with(agora) {
        return (Horario(
            get(Calendar.HOUR),
            get(Calendar.MINUTE),
            get(Calendar.SECOND)
        ))
    }
}