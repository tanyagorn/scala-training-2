trait IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean

  def isEmpty: Boolean

  def union(x: IntSet): IntSet
  def intersect(x: IntSet): IntSet
  def excl(x: Int): IntSet
}