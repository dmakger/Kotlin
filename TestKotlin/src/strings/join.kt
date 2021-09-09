@file:JvmName("StringFunctions")

package strings

import kotlin.text.StringBuilder

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, value) in this.withIndex()) {
        if (index != 0) result.append(separator)
        result.append(value)
    }
    result.append(postfix)
    return result.toString()
}

fun String.lastChar(): Char = this[this.length - 1]

var StringBuilder.lastChar: Char
    get() = get(length-1)
    set(value: Char) {
        this.setCharAt(length-1, value)
    }
