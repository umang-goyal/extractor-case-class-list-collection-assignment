package com.knoldus

class Extractor {
  def email(mail: String): String = {
    val EMAIL = """(\S+)@(\S+)""".r
    mail match {
      case EMAIL(user, domain) =>
        s"user: $user  domain: $domain"
      case _ => "invalid"

    }
  }


  def unapply(url:String):Option[(String , String, String,Map[String,String])] = {
    val parts = url split "://"
    val parts1 = parts(1) split "/"
    val parts2 = url split "[?]"
    val parts3 = parts2(0) split ".com"
    val part4 = url split "[=&?]"
    Some (parts(0),parts1(0), parts3(1),Map(part4(1)->part4(2), part4(3)-> part4(4), part4(5)->part4(6)))
  }


  def unappl(str: String): Option[String] = {
    val parts = str split "-"
    if (parts.length == 3) Some(parts(0)) else None
  }



}

object Extractor extends App{
  val obj = new Extractor
  println(obj.unappl("20-03-1999 09:05:35"))
  println(obj.unapply("https://aws.amazon.com/console/home?state=hash&isauthcode=true&code=112"))
  print(obj.email("umang@gmail.com"))
}