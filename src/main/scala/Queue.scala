class Queue(list: List[Int]) {
  def insert(element: Int): List[Int] = {
    list :+ element
  }

  def delete:List[Int] = {
    list match {
      case Nil => list
      case head :: rest => rest
      case head :: Nil => List.empty[Int]
    }
  }
}

object Queue extends App{
  val list = new stack(List(1,2,3,4))
  println(list.insert(6))
  println(list.delete)
}
