import pingpong.Player
import kotlin.random.Random

fun main() {
    val player = Player(1)
    val kultMap = mutableMapOf("hei" to 0)
    kultMap["hei"]?.plus(1)
    println(kultMap)
}