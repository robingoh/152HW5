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