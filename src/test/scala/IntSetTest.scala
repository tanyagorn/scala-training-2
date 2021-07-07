import org.scalatest.FunSpec

import scala.language.postfixOps

class IntSetTest extends FunSpec {

  describe("IntSet Test") {
    val one = (new EmptySet) incl 1
    val two = (new EmptySet) incl 2

    it("should union two given sets, one and two, then return a set that contains both one and two") {
      val unionOfOneAndTwo = one union two
      assert(unionOfOneAndTwo contains 1)
      assert(unionOfOneAndTwo contains 2)
    }

    it("should intersect two given sets, one and two, then return an empty set") {
      val intersectOfOneAndTwo = one intersect two
      assert(intersectOfOneAndTwo isEmpty)
    }

    it("should intersect one given set with union set of one and two, then return a set contains only one") {
      val unionOfOneAndTwo = one union two
      val intersectOfOneAndUnionOfOneAndTwo = one intersect unionOfOneAndTwo
      assert(intersectOfOneAndUnionOfOneAndTwo contains 1)
      assert(!(intersectOfOneAndUnionOfOneAndTwo contains 2))
    }

    it("should exclude an element from a set") {
      assert(one union two excl 2 contains 1)
      assert(!(one union two excl 2 contains 2))
      assert(one union two excl 2 excl 1 isEmpty)
    }
  }

}