class CustomQueue(capacity: Int) extends TraitQueue {
  private val array: Array[String] = new Array[String](capacity)
  private var front: Int = -1
  private var rear: Int = -1

  override def put(item: String): Array[String] = {
    if (capacity == rear + 1) {
      throw new ArrayIndexOutOfBoundsException("Queue is full")
    } else {
      rear += 1
      array(rear) = item
      array
    }
  }

  override def get(): String = {
    if (front == rear) {
      front = -1
      rear = -1
      throw new NoSuchElementException("Queue is empty")
    } else {
      front += 1
      array(front)
    }
  }

}