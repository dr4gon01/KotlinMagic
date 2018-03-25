package basics

//This is an intro to Collections:

fun main(args: Array<String>){

    //Array -This is not a part of collections frame work
    myArrayOperations()

    //Ranges examples
    rangesExamples()

    //Cool Loop logic and examples
    loopExamples()

    //Collections intro
    collectionsExamples()

    //sets
    val set = hashSetOf(1, 4 ,45, 56)

    val secondSet = setOf(1, 2, 45, 78)


    //maps
    val myMap = hashMapOf(1 to "one", 2 to "two", 3 to "three", 89 to "eighty-nine")

    //list
    val myListOfStrings = listOf("first", "second", "third", "last")

    println("your first element in your strings List is ${myListOfStrings.first()}")
    println("your last element in your strings List is ${myListOfStrings.last()}")


    println("The max element in your set is : ${secondSet.max()}")

}

fun loopExamples() {
    //usage of `continue` keyword
    for (x in 1..20){
        if (x%2 ==0)
            continue
        println("The odd number is :$x")
        if (x==15) break
    }

    //usage of index and value in a for loop
    var myArray: Array<Int> = arrayOf(3,6,9)

    for((index, value) in myArray.withIndex()){
        println("The value is $value @ the index $index")
    }
}

fun rangesExamples() {
    val tenToOne = 10.downTo(1)
    val fourTo20 = 4.rangeTo(20)
    val alpha = "A".."Z"

    println("Start of Ranges examples")
    println("Does alpha contains 'm' : ${"m" in alpha}")
    println("Does alpha contains 'M' : ${"M" in alpha}")
    println("all the numbers reverse from 10 to 1: {${tenToOne.map { it }}}")
    println("all the numbers from 4.rangeTo 20 with a step of 5: {${fourTo20.step(5).map { it }}}")

}

fun collectionsExamples() {
    //arrayList
    val myArrayList = arrayListOf(1, 3 ,4 , 6, 9, "smart")
}

fun myArrayOperations() {
    val myArray = arrayOf("woah!","Second element" , 3, 4, 5.0, 6)

    //print element in an array:
    println("my first & last elements in my array are : ${myArray[0]} and ${myArray[myArray.size-1]} and the size of your array is  is ${myArray.size}")
    //check if an element exists in your array, if does then whats its index
    println("does 5.0 exits in my array : ${myArray.contains(5.0)} and its index is ${myArray.indexOf(5.0)}")
    //sub array
    val subArray = myArray.copyOfRange(0, 3)
    println("your sub array is ${subArray.map { it }}")
}
