package nl.ordina.kotlin

fun main(args: Array<String>) {
    for (a: Int in 1..10) {
        println("First example $a")

    }
    for (a: Int in 10 downTo 1) {
        println("Second example $a")

    }
    for (a: Int in 1..10 step 2) {
        println("Third example $a")

    }

   for (a: Int in 1..10 step 2) {
        println("Fourth example $a")
        if(a == 7) break
    }

    marker@ for (a: Int in 1..10 step 2) {
        for (b: Int in 1.. 10) {
            println("Fifth example $a : $b")
            if (b == 7) break@marker
        }
    }
}
