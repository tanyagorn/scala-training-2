import MathUtils.{GCD, time}

object HelloWorld extends App {
  println("GCD = " + time {
    GCD(12, 18)
  })
}
