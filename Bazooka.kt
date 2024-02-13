import kotlin.random.Random

class Bazooka (
               municion: Int,
               tipoDeMunicion: String,
) :ArmaDeFuego(municion, tipoDeMunicion) {
    override var radio: Radio = if (Random.nextInt(1, 2) == 1){Radio.Intermedio}else{Radio.Enorme}

    override var danio:Int = Random.nextInt(10, 30)

    override val nombre: String = "Bazooka"

    override var municionARestar: Int = 3
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
            cantidadMunicionExtra >= 6 -> {
                cantidadMunicionExtra -= 6
                municion += 6
                return "Se ha recargado el bazooka con el nombre : $nombre y tiene $municion"
            }

            cantidadMunicionExtra < 6 -> {
                return if (cantidadMunicionExtra == 3) {
                    cantidadMunicionExtra = 0
                    municion +=6
                    "Se ha recargado el bazooka con el nombre : $nombre y tiene $municion (Se ha recargado)"
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