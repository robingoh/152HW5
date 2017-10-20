package DnD

import scala.util.Random

/**
  * Created by robg on 10/19/17.
  */

class Character(val name: String, private var health: Int = 100) {
  val NoMoreHealth = 0
  def isAlive = health > NoMoreHealth
  def damage(amount: Int) = {
    health = math.max(NoMoreHealth, health - amount)
  }
  def attack(victim: Character, random: Random) = {
    val damageAmount = math.abs(random.nextInt % (health + 1))
    println(s"$name's health: $health, " +
      s"${victim.name}'s health: ${victim.health}")
    victim.damage(damageAmount)
    if (!victim.isAlive)
      println(s"${victim.name} is dead.")
  }
}
