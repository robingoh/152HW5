package DnD

import scala.util.Random

/**
  * Created by robg on 10/19/17.
  */
class Knight(name: String) extends Character(name) {

  def attack(victim: Dragon, random: Random) = {
    if (this.isAlive) {
      print(s"${this.name} is stabbing ${victim.name}")
      super.attack(victim, random)
    }
  }
}
