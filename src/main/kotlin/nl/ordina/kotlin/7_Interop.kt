package nl.ordina.kotlin

import nl.ordina.kotlin.helper.JavaClass

fun main(args: Array<String>) {

   var javaClass = JavaClass("Java", true)

    println(javaClass.isBool)
    println(javaClass.str)
    println(javaClass.javaFunction)
    println(javaClass.getJavaFunctionWithParameters(4,5))
}
