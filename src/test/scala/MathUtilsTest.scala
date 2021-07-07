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
}