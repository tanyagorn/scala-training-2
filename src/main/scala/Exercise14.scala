/**
 * Design a class that is given a vector of numbers in the constructor and exposes:
 * x: a vector with the square of all elements in the input vector
 * y: the sum of x
 * z: the square root of y
 * Nothing should be calculated in the constructor of the class assume the calculation
 * of x, y, z can take a lot of time, and should only be done once (at most).
 *
 * @param input a vector of numbers
 */
class Exercise14(input: Vector[Int]) {

  private var isXExecuted: Boolean = false
  private var isYExecuted: Boolean = false
  private var isZExecuted: Boolean = false
  private var vectorSquare: Vector[Int] = Vector()
  private var vectorSum: Int = 0
  private var vectorSqrt: Double = 0

  def getIsXExecuted: Boolean = isXExecuted
  def getIsYExecuted: Boolean = isYExecuted
  def getIsZExecuted: Boolean = isZExecuted

  def x(): Vector[Int] = {
    if (!isXExecuted) {
      isXExecuted = true
      vectorSquare = input.map(num => num * num)
    }
    vectorSquare
  }

  def y(): Int = {
    if (!isYExecuted) {
      isYExecuted = true
      x()
      vectorSum = vectorSquare.sum
    }
    vectorSum
  }

  def z(): Double = {
    if (!isZExecuted) {
      isZExecuted = true
      x()
      y()
      vectorSqrt = Math.sqrt(vectorSum)
    }
    vectorSqrt
  }

}
