package Acorn
// problem 4
/**
  * Created by robg on 10/20/17.
  */
class Number(val value: Double) extends Expression {
  def execute: Double = value

  override def toString: String = value.toString
}
 object Number {
   def apply(value: Double) = new Number(value)
 }