package Indus
// problem 3
/**
  * Created by robg on 10/20/17.
  */
class Description(private val description: String,
                  private val price: Double,
                  private val supplier: String) extends Equals {
  override def toString: String =
    s"description: $description, " +
    s"price: $$$price, " +
    s"supplier: $supplier"

  override def hashCode(): Int = this.toString.##
  override def canEqual(that: Any): Boolean = that.isInstanceOf[Description]

  override def equals(obj: scala.Any): Boolean =
    obj match {
      case that: Description =>
        this.canEqual(that) &&
        this.## == that.## &&
        this.description == that.description &&
        this.price == that.price &&
        this.supplier == that.supplier
      case _ => false
    }
}

object Description {
  def apply(description: String,
            price: Int,
            supplier: String) = new Description(description, price, supplier)

}
