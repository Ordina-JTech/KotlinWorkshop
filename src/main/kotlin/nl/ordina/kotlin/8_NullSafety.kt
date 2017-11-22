package nl.ordina.kotlin


fun main(args: Array<String>) {

    //Does not compile
    //val nullString : String  = null

    val nullString: String? = null
    val nullableString: String? = "Kotlin"

    // The elvis operator ? returns null when it encounters a null value
    val person = Person(null)
    println(person.country?.code)

    //To execute an action only when a reference holds a non-nullable value, we can use a let operator.
    nullString?.let {println("Null values will not be printed by .let: $nullString") }
    nullableString?.let {println("Only non null values wil trigger .let: $nullableString") }

   //Also lets you like its name suggest do a additional action after let.
    nullableString?.let {it -> println("Only non null values wil trigger .let: $it"); it }
            ?.also {it -> println("Used string was: $it")}

    //.run is almost the same as .let only .run uses this instead of a function parameter
    nullableString?.run {println(this)}

    //The elvis operator can also be used to send a default value instead of null
    println(person.country?.code ?: "default value is being used.")

    //unsafe call, !! throw a NullPointerException when the given value is null.
    try {
        var b: String? = null
        b!!.length
    } catch( ex: NullPointerException) {
        println("Messege thrown: ${ex.message}")
    }
}


data class Person(val country: Country?)

data class Country(val code: String?)

