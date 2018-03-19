package basics

//This is an intro to Collections:

fun main(args: Array<String>){

    //sets
    val set = hashSetOf(1, 4 ,45, 56)
    val secondSet = setOf(1, 2, 45, 78)

    //arrayList
    val list = arrayListOf(1, 3 ,4 , 6, 9)

    //maps
    val map = hashMapOf(1 to "one", 2 to "two", 3 to "three", 89 to "eighty-nine")

    //list
    val strings = listOf("first", "second", "third", "last")

    println("your last element is {$strings.last()}")

    println("The max element in your set is : ${secondSet.max()}")

}