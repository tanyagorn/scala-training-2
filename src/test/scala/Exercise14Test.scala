import org.scalatest.FunSpec

class Exercise14Test extends FunSpec {

  describe("Given a vector of numbers to a class constructor") {

    val ex1 = new Exercise14(Vector(1, 2, 3, 4))
    it("should return a vector with the square of all elements in the input vector") {
      assert(ex1.x() == Vector(1, 4, 9, 16))
    }

    it("should return the sum of square of all elements in the input vector") {
      assert(ex1.y() == 30)
    }

    it("should return the square root of the sum of square of all elements in the input vector") {
      assert(ex1.z() == 5.477225575051661)
    }

    val ex2 = new Exercise14(Vector(1, 2, 3, 4))
    it("calculation should be done once for method x by observing isXExecuted") {
      assert(!ex2.getIsXExecuted)
      ex2.x()
      assert(ex2.getIsXExecuted)
    }

    it("calculation should be done once for method y by observing isYExecuted") {
      assert(!ex2.getIsYExecuted)
      ex2.y()
      assert(ex2.getIsYExecuted)
    }

    it("calculation should be done once for method z by observing isZExecuted") {
      assert(!ex2.getIsZExecuted)
      ex2.z()
      assert(ex2.getIsZExecuted)
    }
  }

}
