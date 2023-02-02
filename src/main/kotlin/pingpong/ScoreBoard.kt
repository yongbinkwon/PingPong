package pingpong

internal class ScoreBoard(
    private val player1: Player,
    private val player2: Player
) {
    private val player1Score = Score()
    private val player2Score = Score()


    fun givePoint(player: Player) {
        if (player == player1) player1Score.givePoint()
        if (player == player2) player2Score.givePoint()
        throw IllegalStateException("player not on the scoreboard")
    }

    fun winningScore(): Player {
        if (player1Score.winningScore()) return player1
        if (player2Score.winningScore()) return player2
    }
}

