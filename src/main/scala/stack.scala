class stack(list: List[Int]) {
  def insert(element: Int): List[Int] = {
    list :+ element
  }

  def delete: List[Int] = {
    val index = list.size - 1

    @scala.annotation.tailrec
    def inner(list: List[Int], index: Int, count: Int, deletedList: List[Int]): List[Int] = {
      list match {
        case Nil => list
        case a :: rest if count == index => deletedList
        case a :: rest if count != index => inner(rest, index, count + 1, deletedList :+ a)
      }
    }

    inner(list, index, 0, List.empty[Int])
  }
}

object stack extends App{
  val list = new stack(List(1,2,3,4))
  println(list.insert(6))
  println(list.delete)
}
