fun main() {
    var favoriteActor: String? = "Sandra Oh"
    //To access a property of the favoriteActor variable with the !! not-null assertion operator
    //Reassign the favoriteActor variable to your favorite actor's name and then replace the ?. safe-call operator with the !! not-null assertion operator in println() statement
    println(favoriteActor!!.length)
}
