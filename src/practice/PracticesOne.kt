package practice

import practice.Color.*

fun main(arg: Array<String>) {
    // Some daily handy Kotlin snippets

    //Custom accessors : watch how we use get and check for the condition on the go...
    val something = StringOrNah(45)
    val something2 = StringOrNah("DUH!")

    if (something.isString){
        println("1. Yes your input is a string!")} else println("1. Nope its not!")
    if (something2.isString){
        println("1. Yes your input is a string!")} else println("1. Nope its not!")

    //hey! you remember the enum class we created in PracticeTwo.kt, try it out here. C'mon get creative!
    println("2. ${getWarmth(BLACK)}")

}

fun iWillPrintSomethingAwesome( yourCurrentClassName: String ){
    println("Wow! You just used me from a different class or package. But hey! your current class name is $yourCurrentClassName")
}

fun getWarmth(color : Color) =
    when(color){
        RED, BLACK -> "warmth and Dark"
        GREEN -> "Neutral"
        BLUE, WHITE -> "Cold"
    }


class StringOrNah(private val yourString : Any) {
    val isString : Boolean
    get() {
        return yourString is String
    }


}

