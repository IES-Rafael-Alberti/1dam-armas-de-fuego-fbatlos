import kotlin.random.Random.Default.nextInt

class Pistola(
    nombre: String,
    municion: Int,
    municionARestar: Int,
    tipoDeMunicion: String,
) :ArmaDeFuego(nombre, municion, municionARestar, tipoDeMunicion) {
    override var radio: Radio = if (nextInt(1,2) == 1){Radio.Reducido}else{Radio.Corto}

    override var danio:Int = nextInt(1,5)


    override fun dispara(): String {
        TODO("Not yet implemented")
    }

    override fun recargar(): String {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        TODO("Not yet implemented")
    }
}