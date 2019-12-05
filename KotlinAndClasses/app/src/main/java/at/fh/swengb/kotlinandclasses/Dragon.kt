package at.fh.swengb.kotlinandclasses

import android.util.Log

class Dragon(name: String, health: Int, attackStrength: Int, isAlive: Boolean) : LivingThing(name, health,
    attackStrength, isAlive) {
    init {
        breathFire()
    }
    private fun breathFire() {
        Log.i("DRAGON", "The Dragon breaths fire")

    }
    
}