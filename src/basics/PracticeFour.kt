package basics

fun main(args: Array<String>){
    sequenceExample() //filter and maps
    delegatedPropertyExample() //Delegated properties

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
