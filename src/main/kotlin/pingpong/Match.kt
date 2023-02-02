package pingpong

class Match(
    private val player1: Player,
    private val player2: Player
) {

    private val score: ScoreBoard = ScoreBoard(player1, player2)

    fun playMatch(): Result {
        playUntil { score.elevenPoints() }
        playUntil { score.pointDifferential() >= 2 }
        return score.result()
    }

    private fun playUntil(predicate: () -> Boolean) {
        while(!predicate()) {
            score.givePoint(
                player1 playAgainst player2
            )
        }
    }
}