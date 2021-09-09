package test.kotlin

import java.lang.Exception

enum class Color (
    val r: Int, val g: Int, val b: Int
) {

    RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    ORANGE(255, 165, 0), YELLOW(255, 255, 0), INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b

    fun getMnemonic(color: Color) =
        when (color) {
            Color.RED -> "Каждый"
            Color.ORANGE -> "Охотник"
            Color.YELLOW -> "Желает"
            Color.GREEN -> "Знать"
            Color.BLUE -> "Где"
            Color.INDIGO -> "Сидит"
            Color.VIOLET -> "Фазан"
        }

    fun mix(c1: Color, c2: Color) =
        when (setOf(c1, c2)) {
            setOf(RED, YELLOW) -> ORANGE
            setOf(YELLOW, BLUE) -> GREEN
            setOf(VIOLET, BLUE) -> INDIGO
            else -> throw Exception("Грязный цвет")
        }

    fun mixOptimized(c1: Color, c2: Color) =
        when {
            (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> ORANGE
            (c1 == YELLOW && c2 == BLUE) || (c1 == BLUE && c2 == YELLOW) -> GREEN
            (c1 == VIOLET && c2 == BLUE) || (c1 == BLUE && c2 == VIOLET) -> INDIGO
            else -> throw Exception("Грязный цвет")
        }
}