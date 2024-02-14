import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

abstract class ArmaDeFuego (
    var municion:Int,
    val tipoDeMunicion:String,
){

    abstract val nombre:String
    abstract var radio:Radio
    abstract var danio:Int
    abstract var municionARestar: Int
    companion object{var cantidadMunicionExtra:Int = nextInt(5,15)}
    abstract fun dispara(): String
    abstract fun recargar():String
    abstract override fun toString(): String


}
