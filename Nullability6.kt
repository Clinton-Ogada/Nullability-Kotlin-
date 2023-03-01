fun main() {
    val favoriteActor: String? = "Sandra Oh"

    val lengthOfName = if(favoriteActor != null) {
      favoriteActor.length
    } else {
      //The 0 value serves as the default value when the name is null.
      0
    }

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}
