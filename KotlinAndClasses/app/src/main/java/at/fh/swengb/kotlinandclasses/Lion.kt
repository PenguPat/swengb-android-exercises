package at.fh.swengb.kotlinandclasses

import android.util.Log

class Lion(name: String, health: Int, attackStrength: Int, isAlive: Boolean) : LivingThing(name, health,
    attackStrength, isAlive){
    init {
        roar()
    }
    private fun roar() {
        Log.i("LION", "The Lion roars")

    }
}