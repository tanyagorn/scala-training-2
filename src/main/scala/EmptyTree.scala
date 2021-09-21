case object EmptyTree extends IntTree {
  override def contains(v: Int): Boolean = false
  override def insert(v: Int): IntTree = Node(v, EmptyTree, EmptyTree)
}
