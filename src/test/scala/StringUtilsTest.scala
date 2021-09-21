import org.scalatest.FunSpec

import scala.collection.immutable.HashMap

class StringUtilsTest extends FunSpec {

  describe("Find longest word") {
    it("should return the longest word in the string separated by space") {
      assert(StringUtils.findLongestWord("Dummy string just for testing") == "testing")
    }
  }

  describe("Find most common word") {
    it("should return the most common word appear in string separated by space") {
      assert(StringUtils.findMostCommonWord("This dummy string should return dummy") == "dummy")
    }
  }

  describe("Find most common letter") {
    it("should return the most common letter appear in string separated by space") {
      assert(StringUtils.findMostCommonLetter("a bb ccc dddd ee fff") == 'd')
    }
  }

  describe("Create map of letter to word its appear in") {
    it("should return the map with expected result") {
      val expect = HashMap('e' -> Array("demo"), 's' -> Array("This", "is"), 'T' -> Array("This"),
        'm' -> Array("demo"), 'i' -> Array("This", "is"), 'h' -> Array("This"), 'o' -> Array("demo"),
        'd' -> Array("demo"))
      val actual = StringUtils.createMapOfLetterToWordAppear("This is demo")
      val diff = (actual.keySet -- expect.keySet) ++ (expect.keySet -- actual.keySet)
      assert(diff.isEmpty)
    }
  }

  describe("Convert list of string to list of character") {
    it("should return list of character of all the characters in all the strings") {
      val expect = List('o', 'n', 'e', 't', 'w', 'o', '3')
      assert(StringUtils.convertListOfStringToListOfCharacter(List("one", "two", "3")).equals(expect))
    }
  }
}