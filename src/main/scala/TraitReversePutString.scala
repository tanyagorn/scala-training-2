/**
 * Another trait to reverse string.
 */
trait TraitReversePutString extends TraitQueue {
  override def put(item: String) : Array[String] = {
    super.put(item.reverse)
  }
}