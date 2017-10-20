package DnD

import scala.util.Random

/**
  * Created by robg on 10/19/17.
  */
class Knight(name: String) extends Character(name) {

  def attack(victim: Dragon, random: Random) = {
    if (this.isAlive) {
      super.attack(victim, random)
      println(s"${this.name} is stabbing ${victim.name}")
    }
  }
}
