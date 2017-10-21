package Acorn
// problem 4
/**
  * Created by robg on 10/20/17.
  */
class Sum(private val operand1: Expression,
          private val operand2: Expression) extends Expression {
  def execute = operand1.execute + operand2.execute
  override def toString: String = s"(+ $operand1 $operand2)"
}

object Sum {
  def apply(operand1: Expression, operand2: Expression) =
    new Sum(operand1, operand2)
}
