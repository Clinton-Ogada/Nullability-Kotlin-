fun main() {
    var favoriteActor: String? = "Sandra Oh"

    val lengthOfName = if(favoriteActor != null) {
      println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
    } else {
      println("You didn't input a name.")
    }
}
