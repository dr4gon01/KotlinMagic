package basics

import basics.Color.*
import java.util.*


fun main(args: Array<String>) {
    //Lets print the class name using a function from another class, classic function imports

    //hey! you remember the enum class we created in PracticeOne.kt?  try it out here. C'mon get creative!
    iWillPrintSomethingAwesome("PracticesTwo.kt")

    //enums with properties
    println("Hey guess what my favorite color is ? : ${RED.rgb()}")

    //when keyword usage (perfect answer when my wife asks me what suits her the best ;->))
    println(colorPicker(RED))
    println(colorPicker(BLUE))
    println(colorPicker(GREEN))

    println(colorPickerWithMoreOptions(1))
    println(colorPickerWithMoreOptions(WHITE))

    println(colorMixerOptimized(RED, BLUE))

    //for iterations : 1..100 is iterating over a progression
    for (i in 1..100){
        println(fizzBuzz(i))
    }

    println("---------------------")

    //for counting backwards and print only the even numbers do : iterating over a progression with a step
    for (i in 100 downTo 1 step 2){
        println(fizzBuzz(i))
    }

    println("---------------------")

    //for iterators over maps
    iterationOverMapsExample()
}

// when can be used like this:
fun colorPicker(color: Color) =
        when (color) {
            RED -> "Awesome Red is an amazing color"
            Color.BLUE -> "Good Choice! Blue is an amazing color"
            Color.GREEN -> "Fantastic Green is an amazing color"
            Color.BLACK -> "OMG! Black is my favorite too"
            Color.WHITE -> "Purity! White is godly"
        }

//or this:
fun colorPickerWithMoreOptions(anything: Any) =

        when (anything) {
            1 -> "my first color in enums is $RED"
            RED -> "Yay! Reds amazing!"
            RED, BLACK -> "Mix this $anything with Black you get black again! "
            WHITE, RED -> "Mix this $anything with White to get a lighter shade or just White "
            else -> "I don't understand your language... please check your args!"
        }

//or this:
fun colorMixerOptimized(c1: Color, c2: Color) =
        when {
            (c1 == RED && c2 == GREEN) || (c1 == GREEN && c2 == RED) -> println("Yellow yellow dirty fellow")
            (c1 == GREEN && c2 == BLUE ) || (c1 == BLUE && c2 == GREEN ) -> println("Cyan yo!")
            (c1 == BLUE && c2 == RED ) || (c1 == RED && c2 == BLUE ) -> println("Majestic magenta!")
            else  -> throw Exception("Dirty Color")
        }

// Now lets try the iteration in Kotlin
//for loop is for <item> in <elements>
fun fizzBuzz(i : Int) =
        when {
            i% 15 == 0 -> "FizzBuzz"
            i% 3 == 0 -> "Fizz"
            i% 5 == 0 -> "Buzz"
            else -> "$i"
        }

fun iterationOverMapsExample(){
    //we wanna use Tree maps so keys are sorted
    val binaryReps = TreeMap<Char, String>()

    for(letter in 'A'.. 'Z'){
        val binary = Integer.toBinaryString(letter.toInt())
        binaryReps[letter] = binary
    }

    //look at that sweet double variable assignment
    for ((letter, binary) in binaryReps) println("$letter = $binary")
}

enum class Color(private val r: Int, private val g: Int, private val b: Int) {
    //this is an enum class with properties
    //observe the only place where we use a semicolon :-> )
    RED(225, 0, 0),
    BLUE(0, 0, 225), GREEN(0, 225, 0), BLACK(225, 225, 225), WHITE(0, 0, 0);

    //also you can define a function
    fun rgb() = (r * 256 + g) * 256 + b
}
