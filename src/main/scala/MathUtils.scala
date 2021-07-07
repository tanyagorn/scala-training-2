object MathUtils {
  def ~=(x: Double, y: Double)(implicit precision: Double = 0.0001) = {
    if ((x - y).abs < precision) true else false
  }
}