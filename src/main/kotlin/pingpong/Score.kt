package pingpong

internal class Score(
    private val score: Int = 0
) {

    /*
    fun givePoint() = score++

    fun scoreDifferential(other: Score) = score - other.score

    fun elevenOrHigher() = score >= 11

     */

    operator fun inc() = Score(score+1)

    operator fun minus(other: Score) = score - other.score

    operator fun compareTo(other: Score) = score - other.score


}