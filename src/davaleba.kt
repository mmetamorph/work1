fun main() {

    val line =  Point()

    line.ordinate = 10F
    line.abscissa = 5F

    println(line.toString())
    println(line.abscissa == line.ordinate )

    val info = Triangle( height= line.ordinate, base = line.abscissa)
    println(info.getArea())

}

interface IFigure{
    fun getArea(): Float

}

class Point {

    var abscissa: Float = 2F
    var ordinate: Float = 3F

    override fun equals(other: Any?): Boolean {
        if(other is Point)
            if(this.abscissa == this.ordinate) {
                return true
            }
        return false
    }

    override fun toString(): String {
        return "X =${abscissa}, Y= ${ordinate} "

    }
}
class Triangle(private val height: Float, private val base: Float): IFigure {
    override fun getArea(): Float {
        return height*base/2
    }
}
