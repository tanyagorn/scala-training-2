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

  describe("Squares all elements of a list with Pattern Matching") {
    it("should return a list with the results") {
      assert(MathUtils.squareListPatternMatching(List(3, 5, 10)) == List(9, 25, 100))
    }

    it("should return an empty list given empty list") {
      assert(MathUtils.squareListPatternMatching(List()) == List())
    }
  }

  describe("Squares all elements of a list with Mapping") {
    it("should return a list with the results") {
      assert(MathUtils.squareListMap(List(3, 5, 10)) == List(9, 25, 100))
    }

    it("should return an empty list given empty list") {
      assert(MathUtils.squareListMap(List()) == List())
    }
  }

  describe("Find median of input") {
    it("should return a median of a given sequence contains odd elements") {
      assert(MathUtils.median(Seq(5, 1.5, 2, 3.7, 4)) == 3.7)
    }

    it("should return a median of a given sequence contains even elements") {
      assert(MathUtils.median(Seq(6, 1, 2, 3, 4, 5)) == 3.5)
    }
  }
}