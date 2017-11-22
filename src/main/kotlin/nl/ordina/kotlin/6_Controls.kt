package nl.ordina.kotlin

fun main(args: Array<String>) {

    ifElse()
    whenThen()

    iteratingOverCollection()
    iteratingOverMap()
    iteratingOverCollectionWithIndex()
}

fun ifElse() {
    var a = 1
    if (a < 2) {
        println("if")
    } else {
        println("else")
    }
}

fun whenThen() {
    var b = 6
    when {
        b <= 0 -> {
            println("b is smaller or equal 0")
        }
        b in 1..5 -> {
            println("b is between 1 and 5")
        }
        else -> {
            println("Equals to Java default, but in Kotlin it is optional")
        }
    }
}

fun whileLoop() {
    fun condition() = true

    while (condition()) {
        /*...​*/
    }

    do {
        /*...​*/
    } while (condition())
}


fun forLoop() {
    val list = listOf(1, 2, 3)
    for (element in list) {
        print(element)
    }

    for (i in 1..9) { // including 9
        print(i)
    }

    // excluding 10 (the same as 1..9)
    for (i in 1 until 10) {
        print(i)
    }

    for (i in 9 downTo 1 step 2) {
        print(i)
    }
}

fun iteratingOverCollection() {
    val list = listOf("a", "b")
    for (s in list) {
        println(s)
    }
}

fun iteratingOverMap() {
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")

    for ((key, value) in map) {
        println("$key = $value")
    }
}

fun iteratingOverCollectionWithIndex() {
    for ((index, element) in listOf("a", "b", "c").withIndex()) {
        println("$index $element")
    }
}

