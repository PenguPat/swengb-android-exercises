package at.fh.swengb.kotlinandclasses

import kotlin.math.PI

class Circle(private val r : Double) :Shape{
    override fun calculateArea():Double {
        return r*r* PI
    }
}