import pingpong.Player
import pingpong.Score
import kotlin.random.Random

fun main() {
    val player1 = Player(5, "vinner")
    val player2 = Player(5, "taper")
    val match = player1 versus player2
    println(match.playMatch())
}