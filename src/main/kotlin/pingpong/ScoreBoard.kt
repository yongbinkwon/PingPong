package pingpong

import kotlin.math.abs

class ScoreBoard(
    private val player1: Player,
    private val player2: Player
) {
    private val score = mutableMapOf(player1 to 0, player2 to 0)

    fun givePoint(player: Player) {
        score[player] = playerScore(player) + 1
    }

    fun elevenPoints() = score.values.any { it == 11 }

    fun pointDifferential() = abs(playerScore(player1) - playerScore(player2))

    private fun playerScore(player: Player) =
        score[player] ?: throw IllegalStateException("player is not on the scoreboard")

    fun result() = Result(
        player1 to playerScore(player1),
        player2 to playerScore(player2)
    )

}
