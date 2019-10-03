package com.particeep.test

object WhatsWrong1 {

  trait Interface {
    val city: String
    val support: String = s"Ici c'est $city !"
  }

  case object Supporter extends Interface {

    override val city = "Paris"
  }

  Supporter.city //it prints the string Paris
  Supporter.support 
  /*It prints the string Ici c'est null 
  To fix that we must create a function:
  def printSupport:String={ return s"Ici c'est $city"} int the Interface
  and we call the function by this instruction:
  println(WhatsWrong1.Supporter.printSupport)
  */
}
