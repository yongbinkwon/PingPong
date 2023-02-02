package pingpong

internal class Match(
    private val player1: Player,
    private val player2: Player
) {
    private val scoreBoard = ScoreBoard(player1, player2)

    fun playMatch(): ... {
        scoreBoard.givePoint(player1.play(player2))
    }

}