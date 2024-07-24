package operatos

// Prefix and Postfix in kotlin             PreFix  PostFix
// ++       Increment: increases value by1  +aa     a++
// --       Decrement: decreases value by 1 --a     a--

fun main() {

    var a = 6
    var b = 0
    println("a value is $a")
    println("b value is $b")

    // Postfix
    b =  a++
    println("a value is $a")
    println("b value is $b")
}