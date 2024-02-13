import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

abstract class ArmaDeFuego (
    val nombre:String ,
    val municion:Int ,
    val municionARestar: Int,
    val tipoDeMunicion:String
){
    val cantidadMunicionExtra:Int = nextInt(5,15)
    abstract var radio:Radio
    abstract var danio:Int

    abstract fun dispara(): String
    abstract fun recargar():String
    abstract override fun toString(): String


}
