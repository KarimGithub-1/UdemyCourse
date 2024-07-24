package Equality

fun main() {
    var name1 = "Bob"
    var name2 = "Bob"
    println(name1 == name2)
    println(name1.equals(name2))

    println("========== Referential Equality =============")

    // Referential Equality
    // = = =

    var obj = Person("Karim")
    var obj2 = Person("Bob")
    println(obj == obj2)
    println(obj !== obj2)
}

class Person(var name:String)