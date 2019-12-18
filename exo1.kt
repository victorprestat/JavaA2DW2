import java.util.*

fun main(args: Array<String>) {
    val min = 0
    val max = 100

    val random = SplittableRandom()
    val reader = Scanner(System.`in`)
    val goal = random.nextInt(min, max)
    var userReponse: Int

    computerSays("Le programme a choisit un nombre entre $min et $max")
    do {
        computerSays("Proposez un nombre :")
        userReponse = reader.nextInt()
        if (userReponse > goal) computerSays("Moins !")
        else if (userReponse < goal) computerSays("Plus !")
    } while(userReponse != goal)

    computerSays("Bien joué ! Tu as trouvé le bon nombre")
}

fun computerSays(text: String) {
    println("Programme : " + text)
}