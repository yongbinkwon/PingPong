package pingpong

import kotlin.random.Random

class Player(
    private val skill: Int,
    private val name: String
) {
    private var points = Score()

    infix fun play(opponent: Player) = (if (won(opponent)) this else opponent).apply { points++ }

    fun eleven() = points.eleven()

    infix fun differential(opponent: Player) = points - opponent.points

    infix fun versus(opponent: Player) = Match(this, opponent)

    override fun toString() = name


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