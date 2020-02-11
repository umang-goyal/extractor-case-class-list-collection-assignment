class Collections {
  def findLast(list: List[Int]): Any = {
    @scala.annotation.tailrec
    def innerFindLast(list: List[Int], index: Int): Any = {
      list match {
        case Nil => "empty list"
        case head :: Nil => (head, index)
        case head :: rest => innerFindLast(rest, index + 1)
      }
    }

    innerFindLast(list, 0)
  }

  def table(list: List[Int]): List[List[Int]] = {
    list.map(x => List(x, x * 2, x * 3, x * 4, x * 5, x * 6, x * 7, x * 8, x * 9, x * 10))
  }

  def aggregate(A: List[Any], B: List[Any]): Any = {
    if (A.size == B.size) {
      for (a <- A; b <- B) yield (a, b)
    } else {
      "size of list not same"
    }
  }

  def sum(list: List[Int]): Any = {
    if (list.isEmpty) {
      "empty list"
    } else {
      list.foldLeft(0)(_ + _)
    }
  }

  def product(list: List[Int]): Any = {
    if (list.isEmpty) {
      "empty list"
    } else {
      list.foldLeft(1)(_ * _)
    }
  }

  def stackInsert(list: List[Int], element: Int): List[Int] = {
    list :+ element
  }

  def stackDelete(list: List[Int]): List[Int] = {
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


  def queueInsert(list: List[Int], element: Int): List[Int] = {
    list :+ element
  }

  def queueDelete(list: List[Int]): List[Int] = {
    list match {
      case Nil => list
      case head :: rest => rest
      case head :: Nil => List.empty[Int]
    }
  }
}

object Collections extends App{
  val list1 = List(1,2,3,4,5)
  val list2 = List("a", "b", "c", "d", "e")
  val obj = new Collections
  println(obj.findLast(list1))
  println(obj.table(list1))
  println(obj.aggregate(list1, list2))
  println(obj.product(list1))
  println(obj.sum(list1))
  println(obj.stackInsert(list1,3))
  println(obj.stackDelete(list1))
  println(obj.queueInsert(list1,6) )
  println(obj.queueDelete(list1))
}