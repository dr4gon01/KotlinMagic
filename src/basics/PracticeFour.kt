package basics

fun main(args: Array<String>){
    sequenceExample() //filter and maps

    functionsExamples() //Different ways we can play around with functions


}

fun functionsExamples() {
    fun add(num1: Int = 1, num2: Int = 4): Int = num1 + num2
    println("7+9 = ${add(num1 = 7, num2 = 9)} and adding default values the add returns ${add()}")

    //watch how we assign two values in a single declaration
    val (two, three) = thisReturnsNextTwoValues(1)
    println("prints the next two numbers after 1: $two & $three")

    //usage of varargs
    println("sum  of all numbers using varargs is ${getSum(1,2,3,4,5,6,15)}")

    //usage of a function without the function name *mind blown*
    val multiply = {num1: Int, num2 : Int -> num1*num2}
    println("your result after multiplication is  ${multiply(3, 5)}")

    //factorial example:
    println("The factorial of 6! is : ${fact(6)}")

    //Higher Order functions
    val mult3  = mkMathFunction(3)
    println("The result of your multiplication with 3 is ${mult3(5)}")

    //Higher Order functions as an arg
    val mult5 = {num1 : Int -> num1* 5}
    val numList = arrayOf(1,2,3,4,5,6,7)
    mathOnList(numList, mult5)

}

fun mkMathFunction(num1: Int): (Int) -> Int = {num2 -> num1 * num2}

fun mathOnList(numList : Array<Int>, myFunc: (num2: Int) -> Int){
    for(num in numList) {
        println("mathOnList ${myFunc(num)}")
    }
}

fun fact(x: Int): Int {
    tailrec fun factTail(y: Int, z: Int) :Int{
        //exit scenario is a must
        return if(y==0) z
        else factTail(y-1, y * z)
    }
    return factTail(x, 1)
}

fun getSum(vararg numbers: Int):Int{
    var sum = 0
    numbers.forEach { n -> sum += n }
    return sum
}

fun thisReturnsNextTwoValues(num: Int): Pair<Int, Int> {
    return Pair(num + 1, num + 2)
}


fun sequenceExample() {
    //sequence concept:
    val sequence = List(60){ it*5}.asSequence()
    println(sequence.joinToString())
    println(sequence
            .map { it / 10 } // performs [transform] each element in the data
            .filter { it%3 == 0 } //based on [predicate]
            .toList())
}
