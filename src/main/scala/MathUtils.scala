import scala.annotation.tailrec

object MathUtils {
  def ~=(x: Double, y: Double)(implicit precision: Double = 0.0001) = {
    if ((x - y).abs < precision) true else false
  }

  def GCD(a: Int, b: Int): Int = {
    @tailrec def gcd(x: Int, y: Int): Int = if (y == 0) x else gcd(y, x % y)
    gcd(a, b)
  }

  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0) + "ns")
    result
  }

  def squareListPatternMatching(xs: List[Int]): List[Int] =
    xs match {
    case List() => xs
    case y :: ys => y * y :: squareListPatternMatching(ys)
  }

  def squareListMap(xs: List[Int]): List[Int] = xs.map(x => x * x)
}