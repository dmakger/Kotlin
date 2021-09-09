import geometry.shapes.Rectangle
import java.lang.Exception
import java.lang.StringBuilder
import strings.*


data class Person(
    val name: String,
    val age: Int? = null
) {
    var isMan = true
}

fun fizzBizz(d: Int) = when {
    d % 15 == 0 -> "FizzBuzz "
    d % 3 == 0 -> "Fizz "
    d % 5 == 0 -> "Buzz "
    else -> "$d "
}

fun main() {
    val set = hashSetOf(1, 4, 5)
    val list = mutableListOf(1, 3, 54)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    println(set.joinToString(prefix = "(", postfix = ")"))
    println("123".lastChar())
    println("$set: ${set.javaClass}")
    println("$list: ${list.javaClass}")
    println("$map: ${map.javaClass}")
}