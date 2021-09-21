import scala.annotation.tailrec

object MathUtils {
  def ~=(x: Double, y: Double)(implicit precision: Double = 0.0001) = {
    if ((x - y).abs < precision) true else false
  }

  def GCD(a: Int, b: Int): Int = {
    @tailrec def gcd(x: Int, y: Int): Int = if (y == 0) x else gcd(y, x % y)
    gcd(a, b)
  }
}