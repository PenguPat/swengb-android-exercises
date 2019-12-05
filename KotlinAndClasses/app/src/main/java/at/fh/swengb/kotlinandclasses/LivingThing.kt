package at.fh.swengb.kotlinandclasses

import android.util.Log

open class LivingThing(val name : String, var health : Int, val attackStrength : Int, var isAlive : Boolean) {
    fun attack(attackee: LivingThing) {
        Log.i("LivingThing", "Attacking ${attackee.name} with attackStrength: ${attackStrength}")
        attackee.takeDamageFrom(this, attackStrength)
    }
    fun takeDamageFrom(attacker: LivingThing, damage: Int) {
        if(isAlive == true) {
            health = health - damage
            Log.i("LivingThing", "${name} is taking ${damage} damage from: ${attacker.name}")
            if (health <= 0) {
                isAlive = false
                Log.i("LivingThing", "Scheiße, sie haben ${name} getötet!!!")
            }
        }

    }

}