import org.scalatest.FunSpec

class CustomQueueTest extends FunSpec {

  describe("A queue") {
    val queue = new CustomQueue(3)
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
}