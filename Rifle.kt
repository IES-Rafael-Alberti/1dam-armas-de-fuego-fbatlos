import kotlin.random.Random

class Rifle (
municion: Int,
tipoDeMunicion: String ,
) :ArmaDeFuego(municion, tipoDeMunicion) {
    override var radio: Radio = if (Random.nextInt(1, 2) == 1){Radio.Corto}else{Radio.Intermedio}

    override var danio:Int = Random.nextInt(5, 10)

    override val nombre: String = "Rifle"

    override var municionARestar: Int = 2
    override fun dispara():String {
        when {
            municion >= municionARestar -> {
                municion -= municionARestar
                return "Se ha disparado el rifle con el nombre : $nombre y le quedan $municion"
            }

            municion < municionARestar -> {
                return if (cantidadMunicionExtra >= municionARestar) {
                    recargar()
                    municion-=municionARestar
                    "Se ha disparado la rifle con el nombre : $nombre y le quedan $municion (Se ha recargado)"
                }else  {
                    "No hay suficiente munición para disparar."
                }
            }

            else -> {return  "No hay suficiente munición para disparar."}
        }


    }

    override fun recargar(): String {
        when {
            cantidadMunicionExtra >= 4 -> {
                cantidadMunicionExtra -= 4
                municion += 4
                return "Se ha recargado el rifle con el nombre : $nombre y tiene $municion"
            }

            cantidadMunicionExtra < 4 -> {
                return if (cantidadMunicionExtra == 2) {
                    cantidadMunicionExtra = 0
                    municion +=4
                    "Se ha recargado el rifle con el nombre : $nombre y tiene $municion (Se ha recargado)"
                }else  {
                    "No hay suficiente munición para Recargar."
                }
            }

            else -> {return  "No hay suficiente munición para Recargar."}
        }

    }

    override fun toString(): String {
        return "Rifle nombre : $nombre , Munición: $municion , Tipo de Municion: $tipoDeMunicion mm, Daño: $danio , Radio: $radio "
    }
}