package nl.ordina.kotlin

//Primary constructor
class Workshop () {
     var name = "Kotlin"

    //Override the get implementation, extension property
     val customGetter : String
            get() = name.reversed()

    //Secondary constructor, with default value
    constructor(name: String = "Default") : this() {
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