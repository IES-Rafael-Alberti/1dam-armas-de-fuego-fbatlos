fun main(){
    val listaArmas = mutableListOf<ArmaDeFuego>()
    val pistola1 = Pistola(4,"35")
    listaArmas.add(pistola1)
    val rifle1 = Rifle(6,"55")
    listaArmas.add(rifle1)
    val bazooka1 = Bazooka(8 , "85")
    listaArmas.add(bazooka1)
    val disparos = (1..12).map { listaArmas.random() to (1..3).random() }
    var cont = 1
    println("Munición Extra = ${ArmaDeFuego.cantidadMunicionExtra} ... para todas las armas de fuego.")
    println()
    for (disparo in disparos) {
        println("*** Disparo: $cont")
        println("Municion : ${ArmaDeFuego.cantidadMunicionExtra}")
        for (i in 1..disparo.second) {
            println(disparo.first.dispara())
            println(disparo.first.toString())
        }
        cont++
    }

}
