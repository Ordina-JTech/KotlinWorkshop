package nl.ordina.kotlin

import java.util.*


//Primary constructor
class Workshop () {

     var name = "Kotlin"

    //Override the get implementation.
     val customGetter : String
            get() = name.reversed()

    //Secondary constructor
    constructor(name: String) : this() {
        this.name = name
    }
}


//Automatically creates equals/hashcode, toString and copy() functions
data class Pojo(var id: Int, var name: String, val type: String)

fun main(args: Array<String>) {

    val kotlinWorkshop = Workshop()
    println("Today's language is: ${kotlinWorkshop.name}")
    println("${kotlinWorkshop.name} reversed is ${kotlinWorkshop.customGetter}")

    val javaWorkshop = Workshop("Java")
    println("Today's language is: ${javaWorkshop.name}")

    println(Pojo(10, "TestPojo", "ReadOnly"))
}