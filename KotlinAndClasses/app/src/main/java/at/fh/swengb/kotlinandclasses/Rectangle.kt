package at.fh.swengb.kotlinandclasses



open class Rectangle(private val a : Double, private val b : Double) : Shape{
    override fun calculateArea():Double {
        return a*b
    }
}