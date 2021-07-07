import org.scalatest.FunSpec

class MathUtilsTest extends FunSpec {

  describe("Compare between two doubles") {
    it("should return true") {
      assert(MathUtils.~=(0.1001, 0.1000))
    }

    it("should return false given more precisely precision") {
      implicit val precision: Double = 0.00001
      assert(!MathUtils.~=(0.1001, 0.1000))
    }
  }

  describe("Find greatest common divisor of two numbers") {
    it("should return 6 given 12 and 18") {
      assert(MathUtils.GCD(12, 18) == 6)
    }

    it("should return 1 given 5 and 11") {
      assert(MathUtils.GCD(5, 11) == 1)
    }
  }
}