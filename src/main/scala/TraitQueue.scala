/**
 * Use a trait to define a generic queue of strings with 'put' and 'get' methods,
 * and create a class that implements it using an array. Include tests.
 */
trait TraitQueue {
  def put(item: String): Array[String]
  def get(): String
}