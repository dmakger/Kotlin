package geometry.shapes

class Rectangle(
    width_: Int = 0,
    height_: Int = 0
) {
    var width = width_
        private set(w) {
            field = if (w < 0) 0 else w
        }

    var height = height_
        private set(h) {
            field = if (h < 0) 0 else h
        }


    val isSquare: Boolean
        get() = width == height
}