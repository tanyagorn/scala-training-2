import scala.collection.mutable.ListBuffer
import scala.runtime.BoxesRunTime.multiply

class Exercise12 {
  def multiplyNumbersInAListWithCorrespondingValueInAMap(list: List[Int], inputMap: Map[Int, Double]): List[Double] = {
    val result = ListBuffer[Double]()
    list.map(num => {
      if (inputMap.contains(num)) result += multiply(num, inputMap.getOrElse(num, 0)).asInstanceOf[Double]
    })
    result.toList
  }
}
