package at.fh.swengb.kotlinandclasses

class Player(var level : Int, var experience : Int, name: String, health: Int, attackStrength: Int,
             isAlive: Boolean) :LivingThing(name,health, attackStrength, isAlive)