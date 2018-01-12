package nl.ordina.kotlin

import nl.ordina.helper.JavaClass

fun main(args: Array<String>) {

    val javaClass = JavaClass("Java", true)

    println(javaClass.isBool)
    println(javaClass.str)
    println(javaClass.javaFunction)
    println(javaClass.getJavaFunctionWithParameters(4, 5))
}
