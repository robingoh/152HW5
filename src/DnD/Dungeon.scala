package DnD
// problem 1

import scala.util.Random

/**
  * Created by robg on 10/19/17.
  */
object Dungeon {
  val random = new Random(System.nanoTime())

  def main(args: Array[String]): Unit = {
    val puff = new Dragon("Puff")
    val thor = new Knight("Thor")
    puff.printHealth
    println
    thor.printHealth
    println
    while (puff.isAlive && thor.isAlive) {
      thor.attack(puff, random)
      puff.attack(thor, random)
    }
  }
}

/* Console printout (run 1)
Puff's health: 100
Thor's health: 100
Thor is stabbing Puff -4, Puff's health: 96, Thor's health: 100
Puff is flaming Thor -43, Thor's health: 57, Puff's health: 96
Thor is stabbing Puff -9, Puff's health: 87, Thor's health: 57
Puff is flaming Thor -84, Thor's health: 0, Puff's health: 87
Thor is dead.
 */
/* Console printout (run 2)
Puff's health: 100
Thor's health: 100
Thor is stabbing Puff -50, Puff's health: 50, Thor's health: 100
Puff is flaming Thor -9, Thor's health: 91, Puff's health: 50
Thor is stabbing Puff -8, Puff's health: 42, Thor's health: 91
Puff is flaming Thor -22, Thor's health: 69, Puff's health: 42
Thor is stabbing Puff -61, Puff's health: 0, Thor's health: 69
Puff is dead.
 */