package DnD

/**
  * Created by robg on 10/19/17.
  */
class Knight(name: String) extends Character(name) {
  def attack(victim: Dragon, amount: Int) = {
    println(s"${this.name} is stabbing ${victim.name}")
    victim.damage(amount)
  }
}
