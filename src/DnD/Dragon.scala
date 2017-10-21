package DnD
// problem 1

import scala.util.Random

class Dragon(name: String) extends Character(name) {
  def attack(victim: Knight, random: Random) = {
    if (this.isAlive) {
      print(s"$name is flaming ${victim.name}")
      super.attack(victim, random)
    }
  }
}