import org.scalatest.FunSpec

class Exercise11Test extends FunSpec {

  val exercise11 = new Exercise11
  describe("Get first not none input") {
    it("should return second input which is not none since the first input is none") {
      assert(exercise11.getFirstNotNoneInput(None, Some(2), Some(3)) == Some(2))
    }

    it("should return none since all three inputs are none") {
      assert(exercise11.getFirstNotNoneInput(None, None, None) == None)
    }
  }

  describe("Get product of inputs") {
    it("should return product of inputs given all are defined") {
      assert(exercise11.getProduct(Some(1), Some(2), Some(3)) == 6)
    }

    it("should return 0 given one of input is none") {
      assert(exercise11.getProduct(None, Some(2), Some(3)) == 0)
    }
  }

  describe("Get first not none input from a sequence of optional elements") {
    it("should return third element which is not none since the first and second element are none") {
      assert(exercise11.getFirstNotNoneFromSeqOptional(Seq(None, None, Some(3), Some(4), None)) == Some(3))
    }

    it("should return none since all elements in sequence are none") {
      assert(exercise11.getFirstNotNoneFromSeqOptional(Seq(None, None, None, None, None)) == None)
    }
  }


}
