package org.jetbrains.kotlinworkshop.student.introduction._2Shop

fun main(args: Array<String>) {
    val sum = listOf(1, 5, 3).sum()

    println(sum) // 9
}

// Return the sum of prices of all products that a customer has ordered.
// Note: a customer may order the same product for several times.
fun Customer.getTotalOrderPrice(): Double {
    return this.orders.sumByDouble { it.products.sumByDouble { it.price } }
    //return orders.flatMap { it.products }.map { it.price }.sum()
}
