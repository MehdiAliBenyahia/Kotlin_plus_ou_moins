import java.util.*

fun main(args: Array<String>) {

    val goal = choixnb()
    var nbessaie = 0
    do {
        nbessaie++
        "Ecrit un nombre".outputAsComputer()
    } while(tryingToGuess(goal) != goal)

    "Bravo tu as trouvé le nombre au bout de $nbessaie fois .".outputAsComputer()
}

fun choixnb(min: Int = 0, max: Int = 1000): Int {
    val random = SplittableRandom()
    val goal = random.nextInt(min, max)
    "Choisi un nombre entre $min et $max".outputAsComputer()
    return goal
}

fun tryingToGuess(goal: Int) : Int {
    val reader = Scanner(System.`in`)
    val utilisateur = reader.nextInt()
    when {
        utilisateur > goal -> "moins !".outputAsComputer()
        utilisateur < goal -> "plus !".outputAsComputer()
    }
    return utilisateur
}

fun String.outputAsComputer() {
    println(" Maitre du jeu : " + this)
}