package DnD

/**
  * Created by robg on 10/19/17.
  */

class Character(val name: String) {
  val NoMoreHealth = 0
  var health: Int = 100
  def isAlive = health > NoMoreHealth
  def damage(amount: Int) = {
    health = math.max(NoMoreHealth, health - amount)
  }
}
