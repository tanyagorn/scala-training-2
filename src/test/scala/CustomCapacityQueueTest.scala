import org.scalatest.FunSpec

class CustomCapacityQueueTest extends FunSpec {

  describe("A queue") {
    val queue = new CustomCapacityQueue(3)
    it("should put value in order to the end of the queue") {
      assert(queue.put("1st").toSeq == Array("1st", null, null).toSeq)
      assert(queue.put("2nd").toSeq == Array("1st", "2nd", null).toSeq)
      assert(queue.put("3rd").toSeq == Array("1st", "2nd", "3rd").toSeq)
    }

    it("should throw ArrayIndexOutOfBoundsException when cannot put to a full queue") {
      val caught = intercept[ArrayIndexOutOfBoundsException] {
        queue.put("4th")
      }
      assert(caught.getMessage == "Queue is full")
    }

    it("should get value in order from the front of the queue") {
      assert(queue.get() == "1st")
      assert(queue.get() == "2nd")
      assert(queue.get() == "3rd")
    }

    it("should throw NoSuchElementException when cannot get value from empty queue") {
      val caught = intercept[NoSuchElementException] {
        queue.get()
      }
      assert(caught.getMessage == "Queue is empty")
    }
  }

  describe("A queue with stackable trait to reverse string before add to queue") {
    val reverseStringQueue = new CustomCapacityQueue(3) with TraitReversePutString
    it("should put reverse string value in order to the end of the queue") {
      assert(reverseStringQueue.put("1st").toSeq == Array("ts1", null, null).toSeq)
      assert(reverseStringQueue.put("2nd").toSeq == Array("ts1", "dn2", null).toSeq)
      assert(reverseStringQueue.put("3rd").toSeq == Array("ts1", "dn2", "dr3").toSeq)
    }

    it("should get value in order from the front of the queue") {
      assert(reverseStringQueue.get() == "ts1")
      assert(reverseStringQueue.get() == "dn2")
      assert(reverseStringQueue.get() == "dr3")
    }

  }
}