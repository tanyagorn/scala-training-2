class Exercise11 {
  def getFirstNotNoneInput(x: Option[Int], y: Option[Int], z: Option[Int]) : Option[Int] = {
    val listFilterOutNonEmpty = List(x, y, z).filter(_.nonEmpty)
    if (listFilterOutNonEmpty.isEmpty) None else listFilterOutNonEmpty.head
  }

  def getProduct(x: Option[Int], y: Option[Int], z: Option[Int]) : Int = {
    if (List(x, y, z).count(_.isDefined) == 3)
      List(x, y, z).map(_.get).product
    else
      0
  }

  def getFirstNotNoneFromSeqOptional(seq: Seq[Option[Int]]) : Option[Int] = {
    val listFilterOnlyDefined = seq.filter(_.isDefined)
    if (listFilterOnlyDefined.isEmpty) None else listFilterOnlyDefined.head
  }

}
