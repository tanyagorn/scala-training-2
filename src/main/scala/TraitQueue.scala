/**
 * Exercise 2
 * Starting from the previous exercise, use a stackable trait to modify
 * the behavior of 'put' so it reverses each string (e.g. hello to olleh)
 * before adding it to the queue. Include tests.
 */
trait TraitQueue {
  private var capacity = 10
  private var array: Array[String] = new Array[String](capacity)
  private var front: Int = -1
  private var rear: Int = -1

  def put(item: String): Array[String] = {
    if (capacity == rear + 1) {
      throw new ArrayIndexOutOfBoundsException("Queue is full")
    } else {
      rear += 1
      array(rear) = item
      array
    }
  }

  def get(): String = {
    if (front == rear) {
      front = -1
      rear = -1
      throw new NoSuchElementException("Queue is empty")
    } else {
      front += 1
      array(front)
    }
  }

  def setCapacity(newCapacity: Int): Unit = {
    capacity = newCapacity;
    array = new Array[String](capacity)
  }
}