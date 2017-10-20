package DnD

class Dragon(name: String) extends Character(name) {
  def attack(victim: Knight, amount: Int) = {
    println(s"$name is flaming ${victim.name}")
    victim.damage(amount)
  }
}

//class Dragon(val name: String, private var health: Int = 100) {
//  def damage(amt: Int) {
//    health = math.max(0, health - amt)
//  }
//  def getHealth = health
//  override def toString = name + " (health = " + health + ")"
//}

// companion object
object Dragon {
  def apply(name: String, health: Int = 100) = new Dragon(name, health)

  def test {
    val puff = new Dragon("Puff")
    println(puff.health)
    puff.health = puff.health/2
    println(puff.health)
    puff.damage(30)
    println(puff.health)
  }
}
