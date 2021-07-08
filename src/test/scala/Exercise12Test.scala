import org.scalatest.FunSpec

class Exercise12Test extends FunSpec {

  describe("Multiply numbers in a list with corresponding value in a map") {
    it ("should drop value if number in a list doesn't exist as a key in the map") {
      val exercise12 = new Exercise12
      assert(exercise12.multiplyNumbersInAListWithCorrespondingValueInAMap(List(1, 2, 3, 4), Map(1 -> 3, 3 -> 5)) == List(3, 15))
      assert(exercise12.multiplyNumbersInAListWithCorrespondingValueInAMap(List(1, 2, 3, 4), Map(2 -> 3, 4 -> 10)) == List(6, 40))
      assert(exercise12.multiplyNumbersInAListWithCorrespondingValueInAMap(List(1, 2, 3, 4), Map(5 -> 3)) == List())
    }
  }
}
