package nl.ordina.kotlin

import nl.ordina.kotlin.helper.JavaExampleClass

fun main(args: Array<String>) {

   var javaClass = JavaExampleClass("Java", true)

    println(javaClass.isBool)
    println(javaClass.str)
    println(javaClass.javaFunction)
    println(javaClass.getJavaFunctionWithParameters(4,5))
}
