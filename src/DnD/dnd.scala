package DnD

object dnd {
  def main(args: Array[String]): Unit = {
    Dragon.test
    val d = Dragon("Garp", 100)
//    d.health = d.health + 10
    d.damage(30)
//    println(d.getHealth)
    println(d)
  }
}
