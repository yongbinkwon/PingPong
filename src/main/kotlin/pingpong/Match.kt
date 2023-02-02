package pingpong

import pingpong.Result
import kotlin.math.abs

class Match constructor(
    private val player1: Player,
    private val player2: Player
) {

    fun playMatch() = result(
        winner(firstToEleven())
    )

    private fun firstToEleven(): Player {
        var leader = player1
        while(!leader.eleven()) {
            leader = player1 play player2
        }
        return leader
    }

    private fun winner(leadingPlayer: Player): Player {
        var leader = leadingPlayer
        while(abs(player1 differential player2) < 2) {
            leader = player1 play player2
        }
        return leader
    }

    private fun result(winner: Player) = Result(
        winner = winner,
        loser = player1.takeIf { winner == player1 } ?: player2
    )
}