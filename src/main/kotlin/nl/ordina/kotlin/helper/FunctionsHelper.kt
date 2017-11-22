package nl.ordina.kotlin.helper

fun externalFunction( ) {
    println("External function")
}

private fun externalPrivateFunction () {
    println("This function can not be imported in other classes.")
}
