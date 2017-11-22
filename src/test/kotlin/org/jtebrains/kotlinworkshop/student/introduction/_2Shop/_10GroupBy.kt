package org.jtebrains.kotlinworkshop.student.introduction._2Shop

import org.jetbrains.kotlinworkshop.student.introduction._2Shop.*
import org.junit.Test
import kotlin.test.*

class _10GroupBy {
    @Test fun testGroupCustomersByCity() {
        assertEquals(groupedByCities, shop.groupCustomersByCity())
    }
}
