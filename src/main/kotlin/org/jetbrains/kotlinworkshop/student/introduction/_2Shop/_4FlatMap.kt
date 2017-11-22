package org.jetbrains.kotlinworkshop.student.introduction._2Shop

fun main(args: Array<String>) {
    val result = listOf("abc", "12").flatMap(String::toList)

    result == listOf('a', 'b', 'c', '1', '2')

    println(result)   // [a, b, c, 1, 2]
}

// Return all products that were ordered by customer
val Customer.orderedProducts: Set<Product> get() {
   return orders.flatMap { it -> it.products }.toSet()
}

// Return all products that were ordered by at least one customer
val Shop.allOrderedProducts: Set<Product> get() {
   return  customers.flatMap { it -> it.orderedProducts }.toSet()
}
