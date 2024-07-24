package whenExpression

fun main() {
    val user = User("John","Bob")

    when {
        user.firstName == "John" || user.lastName == "Bob" -> {
            println("Yes")
        } else -> println("No")
    }
}

class User(var firstName: String, var lastName: String) {

}