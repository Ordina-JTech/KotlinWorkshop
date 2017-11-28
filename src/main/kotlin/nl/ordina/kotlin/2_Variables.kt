package nl.ordina.kotlin


fun main(args: Array<String>) {


   //Mutable vs Immutable variables

    //Mutable
    var mutableVar = 0
    println("mutableVar is now: $mutableVar")
    mutableVar += 3
    println("after adding 3 it is: $mutableVar")

    //Immutable
    val immutableVar = 0
    println("if we try to reasign or change immutableVar it won't compile")
    // If uncommented it won't compile
    // immutableVar += 3

    // val is a read-only reference, not a object
    val languages = mutableListOf("Java")
    languages.add("Kotlin")
    println(languages)

    val multiLineString = """ This String has
        | multiple lines
        | of code
        """
    println(multiLineString)

}
