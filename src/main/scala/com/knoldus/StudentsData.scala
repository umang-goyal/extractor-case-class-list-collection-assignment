//package com.knoldus
//
//class StudentsData {
//
//  val students = List(Student(1, "Kunal"), Student(2, "Himanshu"), Student(3, "Geetika"), Student(4, "Mansi"), Student(5, "Muskan"),
//    Student(6, "Abhinav"), Student(7, "Suraj"), Student(8, "Shivani"), Student(9, "Yamini"), Student(10, "Sparsh"))
//  val marks = List(Marks(1, 1, 95), Marks(2, 1, 75), Marks(3, 1, 95), Marks(4, 1, 95), Marks(5, 1, 89),
//    Marks(10, 2, 95), Marks(2, 2, 75), Marks(3, 2, 95), Marks(4, 2, 95), Marks(5, 2, 89),
//    Marks(10, 3, 53), Marks(2, 3, 74), Marks(3, 3, 56), Marks(4, 3, 9), Marks(5, 3, 8),
//    Marks(10, 4, 9), Marks(2, 4, 7), Marks(3, 4, 94), Marks(4, 4, 54), Marks(5, 4, 80),
//    Marks(1, 5, 78), Marks(2, 5, 75), Marks(3, 5, 9), Marks(4, 5, 5), Marks(5, 5, 89),
//    Marks(1, 6, 50), Marks(2, 6, 60), Marks(3, 6, 56), Marks(4, 6, 95), Marks(5, 6, 9),
//    Marks(1, 7, 30), Marks(2, 7, 75), Marks(3, 7, 95), Marks(4, 7, 95), Marks(5, 7, 89),
//    Marks(1, 8, 65), Marks(2, 8, 85), Marks(3, 8, 25), Marks(4, 8, 55), Marks(5, 8, 89),
//    Marks(1, 9, 95), Marks(2, 9, 55), Marks(3, 9, 95), Marks(4, 9, 95), Marks(5, 9, 9),
//    Marks(1, 10, 9), Marks(2, 10, 7), Marks(3, 10, 95), Marks(4, 10, 55), Marks(5, 10, 9))
//
//  def passFail(subjectId: Int, percentage: Int, check: String): List[Long] = {
//    if (check.toLowerCase() == "pass") {
//      for {student <- students; studentResult <- marks
//           if student.id == studentResult.studentId && studentResult.subjectId == subjectId && studentResult.marksObtained >= percentage} yield student.id
//    } else {
//      for {student <- students; studentResult <- marks
//           if student.id == studentResult.studentId && studentResult.subjectId == subjectId && studentResult.marksObtained < percentage} yield student.id
//    }
//  }
//
//  val marksSorted = marks.sorted
//
//  def topBottom(subjectId: Int, count: Int, find: String): List[(String, Float)] = {
//    if (find.toLowerCase() == "bottom") {
//      val list = for {
//        result <- marksSorted
//        student <- students
//        if result.subjectId == subjectId && student.id == result.studentId
//      } yield (student.name, result.marksObtained)
//      list.take(count)
//    } else {
//      val list = for {
//        result <- marks.sorted.reverse
//        student <- students
//        if result.subjectId == subjectId && student.id == result.studentId
//      } yield (student.name, result.marksObtained)
//      list.take(count)
//    }
//  }
//
//  case class Student(id: Long, name: String)
//
//  passFail(2, 50, "pass").size
//
//  case class Marks(subjectId: Int, studentId: Long, marksObtained: Float)
//
//  topBottom(5, 5, "bottom")
//}
//
//
//
