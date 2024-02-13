import kotlin.random.Random.Default.nextInt

class Pistola(
    municion: Int,
    tipoDeMunicion: String ,
) :ArmaDeFuego(municion, tipoDeMunicion) {
    override val nombre: String = "Pistola"

    override var radio: Radio = if (nextInt(1,2) == 1){Radio.Reducido}else{Radio.Corto}

    override var danio:Int = nextInt(1,5)

    override var municionARestar: Int = 1


    override fun dispara():String {
        when {
            municion >= municionARestar -> {
                municion -= municionARestar
                return "Se ha disparado la pistola con el nombre : $nombre y le quedan $municion"
            }

            municion < municionARestar -> {
                return if (cantidadMunicionExtra >= municionARestar) {

                    recargar()
                    "Se ha disparado la pistola con el nombre : $nombre y le quedan ${--municion} (Se ha recargado)"
                }else  {
                    "No hay suficiente munición para disparar."
                }
            }

            else -> {return  "No hay suficiente munición para disparar."}
        }


    }

    override fun recargar(): String {
        when {
            cantidadMunicionExtra >= 2 -> {
                cantidadMunicionExtra -= 2
                municion += 2
                return "Se ha recargado la pistola con el nombre : $nombre y tiene $municion"
            }

            cantidadMunicionExtra < 2 -> {
                return if (cantidadMunicionExtra == 1) {
                        cantidadMunicionExtra = 0
                         municion +=1
                        "Se ha recargado la pistola con el nombre : $nombre y tiene $municion (Se ha recargado)"
                    }else  {
                        "No hay suficiente munición para Recargar."
                    }
            }

            else -> {return  "No hay suficiente munición para Recargar."}
        }

    }

    override fun toString(): String {
        return "Pistola nombre : $nombre , Munición: $municion , Tipo de Municion: $tipoDeMunicion mm, Daño: $danio , Radio: $radio "
    }
}