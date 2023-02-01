package pingpong

import kotlin.random.Random

internal class Player(
    private val skill: Int
) {

    fun play(opponent: Player) = if (won(opponent)) this else opponent

    /*
    fun play(opponent: Player): Player {
        val winningPercentage = ...
        val won = Random.nextDouble() < winningPercentage
        if (won) {
            return this
        } else {
            return opponent
        }
    }

    private fun winningPercentage(opponent: Player): Double {
        return skill.toDouble()/(skill + opponent.skill)
    }

     */

    private fun won(opponent: Player) = Random.nextInt(0, skill+opponent.skill) < skill
}