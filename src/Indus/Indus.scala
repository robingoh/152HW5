package Indus

import scala.collection.mutable

/**
  * Created by robg on 10/20/17.
  */
object Indus extends App {
//  val inventory = collection.mutable.Map[Description, Int]
  val dvd1 = Item(new Description("The Matrix DVD", 15.50, "DVD World"))
  val dvd2 = Item(new Description("The Matrix DVD", 15.50, "DVD World"))
  println(dvd1.description == dvd2.description)

  val inventory = new mutable.HashMap[Item, Int]
  val dvdA = Item(new Description("The Matrix DVD", 15.50, "DVD World"))
  val dvdB = Item(new Description("The Terminator DVD", 13.25, "DVD World"))
  val dvdC = Item(new Description("Ironman DVD", 18.00, "DVD Planet"))
  inventory += (dvdA -> 5)
  inventory += (dvdB -> 3)
  inventory += (dvdC -> 2)

  inventory.foreach(println _)
}
