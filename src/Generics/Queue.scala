package Generics
// problem 2

import scala.collection.mutable.ArrayBuffer

/**
  * Created by robg on 10/20/17.
  */
class Queue[T](val capacity: Int = 100) {
  private val elements: ArrayBuffer[T] = new ArrayBuffer[T](capacity)
  def enqueue(element: T) = {
    elements += element
  }
  def dequeue = {
    val first = elements.remove(0)
    first
  }
  def isEmpty = {
    elements.isEmpty
  }

  override def toString: String = {
    elements.toString
  }
}

object Queue {
  def apply[T](capacity: Int = 100) = new Queue[T](capacity)

  def main(args: Array[String]): Unit = {
    val waitingList = Queue[String](100)
    waitingList.enqueue("Alpha")
    waitingList.enqueue("Bravo")
    waitingList.enqueue("Charlie")
    waitingList.enqueue("Delta")
    waitingList.enqueue("Echo")
    println(waitingList)
    while (!waitingList.isEmpty) {
      waitingList.dequeue
      println(waitingList)
    }
  }
}