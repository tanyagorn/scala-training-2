case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree {

  override def contains(v: Int): Boolean = {
    def contains(t: IntTree, v: Int): Boolean =
      t match {
      case Node(data, _, _) if (data == v) => true
      case Node(data, l, r) => if (data > v) contains(l, v) else contains(r, v)
      case _ => false
    }

    contains(this, v)
  }

  override def insert(v: Int): IntTree = {
    def insert(t: IntTree, v: Int): IntTree =
      t match {
      case Node(data, l, r) if (data > v) => { println("2")
        Node(data, insert(l, v), r)
      }
      case Node(data, l, r) if (data < v) => { println("3")
        Node(data, l, insert(r, v)) }
      case EmptyTree => t insert v
      case _ => t
    }
    println("1")
    insert(this, v)
  }
}