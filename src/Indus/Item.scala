package Indus

/**
  * Created by robg on 10/20/17.
  */
class Item(val description: Description) extends Equals {
  private val id: Int = Item.nextId
  Item.nextId += 1

  override def canEqual(that: Any) = that.isInstanceOf[Item]
  override def toString: String = s"id: $id, $description"
  override def hashCode(): Int = this.toString.##
  override def equals(obj: scala.Any): Boolean =
    obj match {
      case that: Item =>
        this.canEqual(that) &&
          this.## == that.## &&
          this.description == that.description
      case _ => false
    }
}

object Item {
  def apply(description: Description) = new Item(description)
  var nextId = 0
}