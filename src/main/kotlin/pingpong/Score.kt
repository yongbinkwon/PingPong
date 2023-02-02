package pingpong

internal class Score {
    private var score = 0

    fun givePoint() = score++

    fun winningScore() = score >= 11

    fun scoreDifferential(other: Score) = score - other.score
}