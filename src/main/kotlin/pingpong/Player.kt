package pingpong

import kotlin.random.Random

class Player(
    private val name: String,
    private val skill: Int
) {

    infix fun playAgainst(opponent: Player) = if (won(opponent)) this else opponent

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

    override fun toString() = name
}