package Conditions

fun main() {
    var price = 100
    if(price == 25) {
        println("Yes $price")
    } else if (price == 50) {
        println("Good $price")
    } else if (price == 100) {
        println("Too expensive $price")
    }
    else {
        println("Not found")
    }

    println("=======================")

    var age = 25
    if(age > 18) {
        println("Your is $age")
    } else {
        println("Your age is less than 18!")
    }

    val myAge = 25
    if(age > 18) println("Your age is $age") else println("Your age is $age")

}