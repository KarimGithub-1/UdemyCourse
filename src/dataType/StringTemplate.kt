package dataType

fun main() {
    val message:String = """
       Hello,
       My Name is Ali,
       How are you?
    """.trimIndent()
    println(message)

    println("========================")

    val message2:String = """
       Hello,
       My Name is Omar,
       How are you?
    """.replaceIndent("$---")
    println(message2)

    println("========================")

    val message3:String = """
       >> Hello,
       >> My Name is Abdulaziz,
       >> How are you?
    """.trimMargin(">>")
    println(message3)

    println("========================")

    val name = "Abdullah"
    val age = 22
    println("Hello $name, your age is : ${name.length} Characters Long")
}