package nl.ordina.kotlin

import nl.ordina.kotlin.helper.externalFunction

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun printAdd() {
    val sum = sum(4, 5)
    println("4 + 5 = $sum")
}

//Also a one line function
fun functionWithDefaultParameter(str: String = "test" ) { println(str) }

// Extension functions
fun String.prefix(prefix: String) : String {
    return "$prefix $this"
}

fun main(args: Array<String>) {
    printAdd()
    externalFunction()
    functionWithDefaultParameter()
    functionWithDefaultParameter("different name")
    println("Sir Davos".prefix("Hello"))
}



//Extension properties


