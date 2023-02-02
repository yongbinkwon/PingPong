import pingpong.Match
import pingpong.Player

fun main() {
    val bin = Player("Bin", 9)
    val th = Player("Tom Henrik", 1)

    val match = Match(bin, th)
    println(match.playMatch())
}