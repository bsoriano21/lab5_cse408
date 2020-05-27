fun main() {
    var cardPoints = 7_000

    // TODO: replace this if with a when
    // try to use  ranges!

    val cardLevel: String = when {
        cardPoints >= 0 && cardPoints < 1000 -> {
            "pearl"
        }
        cardPoints >= 1000 && cardPoints < 5_000 -> {
            "silver"
        }
        cardPoints >= 5_000 && cardPoints < 10_000 -> {
            "gold"
        }
        else -> "platinum"
    }

    val plural = if(cardPoints > 1 || cardPoints == 0) "s" else ""
    println("You have $cardPoints point$plural and are at the $cardLevel level.")
}