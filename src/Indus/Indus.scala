package Indus
// problem 3
import scala.collection.mutable

/**
  * Created by robg on 10/20/17.
  */
object Indus extends App {
  val dvd1 = Item(new Description("The Matrix DVD", 15.50, "DVD World"))
  val dvd2 = Item(new Description("The Matrix DVD", 15.50, "DVD World"))
  println(dvd1.description == dvd2.description) // should be true

  // The problem wants a Map[Description, Int], but that does not make sense. And thus,
  // was Map[Item, Int] is used instead.
  val inventory = new mutable.HashMap[Item, Int]
  val dvdA = Item(new Description("The Matrix DVD", 15.50, "DVD World"))
  val dvdB = Item(new Description("The Terminator DVD", 13.25, "DVD World"))
  val dvdC = Item(new Description("Ironman DVD", 18.00, "DVD Planet"))
  inventory += (dvdA -> 5)
  inventory += (dvdB -> 3)
  inventory += (dvdC -> 2)

  println("Inventory:")
  inventory.foreach(println _)
}