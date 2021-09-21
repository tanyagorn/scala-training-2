class EmptySet extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmptySet(x, new EmptySet, new EmptySet)

  def isEmpty: Boolean = true

  def union(x: IntSet): IntSet = x
  def intersect(x: IntSet): IntSet = new EmptySet
  def excl(x: Int): IntSet = new EmptySet
}