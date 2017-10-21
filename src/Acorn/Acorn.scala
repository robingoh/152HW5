package Acorn
// problem 4
/**
  * Created by robg on 10/21/17.
  */
object Acorn extends App {
  var expression: Expression = Sum(Number(42), Product(Number(3.14), Number(2.71)))
  def printResult = println(s"the value of $expression = ${expression.execute}")
  printResult
  expression = Product(Number(2), Product(Number(3), Number(5)))
  printResult
  expression = Sum(Product(Number(22), Number(0.5)), Product(Number(3), Number(5)))
  printResult
}