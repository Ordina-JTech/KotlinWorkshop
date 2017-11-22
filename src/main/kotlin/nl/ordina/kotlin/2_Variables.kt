package nl.ordina.kotlin


//Constants
const val CONSTANT = "This is a constant"


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


    // val is read-only reference, not object
    val languages = mutableListOf("Java")
    languages.add("Kotlin")
    println(languages)

    println("Constant: ${CONSTANT}")

    val multiLineString = """ This String has
        | multiple lines
        | of code
        """

    println(multiLineString)

}
