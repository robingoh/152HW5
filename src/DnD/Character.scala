package DnD
// problem 1

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
  def printHealth = {
    print(s"$name's health: $health")
  }

  def attack(victim: Character, random: Random) = {
    val damageAmount = math.abs(random.nextInt % (health + 1))
    print(s" ${-damageAmount}, ")
    victim.damage(damageAmount)
    victim.printHealth
    print(", ")
    this.printHealth
    println
    if (!victim.isAlive)
      println(s"${victim.name} is dead.")
  }
}