package org.jtebrains.kotlinworkshop.student.introduction._2Shop

import org.jetbrains.kotlinworkshop.student.introduction._2Shop.*
import org.junit.Test
import kotlin.test.*

class _8Zip {
    @Test
    fun testZipNameAndCustomer() {
        assertEquals(customers.toList(), shop.zipNameAndCustomer())
    }
}