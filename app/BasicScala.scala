package com.particeep.test

/**
  * This is basic language questions so don't use external library or build in function
  */
object BasicScala {


  /**
    * Encode parameter in url format
    *
    * Example:
    *
    * input  : Map("sort_by" -> "name", "order_by" -> "asc", "user_id" -> "12")
    * output : "?sort_by=name&order_by=asc&user_id=12"
    *
    * input  : Map()
    * output : ""
    */
  def encodeParamsInUrl(params: Map[String, String]): String = {
      var urlString:String=""
      if(params.isEmpty) urlString="" else urlString="?"
      params foreach {case (key, value) => 
      urlString=urlString+key + "=" + value+"&"}
      urlString=urlString.slice(0,urlString.length-1)
      return urlString
  }




  /**
    * Test if a String is an email
    */
  private val emailRegex = """^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,3})$""".r


def isEmail(maybeEmail: String): Boolean = maybeEmail match{
    case null                                           => false
    case maybeEmail if maybeEmail.trim.isEmpty                            => false
    case maybeEmail if emailRegex.findFirstMatchIn(maybeEmail).isDefined  => true
    case _                                              => false
}


  /**
    * Compute i ^ n
    *
    * Example:
    *
    * input : (i = 2, n = 3) we compute 2^3 = 2x2x2
    * output : 8
    *
    * input : (i = 99, n = 38997)
    * output : 1723793299
    */
  def power(i:Int, n:Int):Int = {
    var value:Int=1
    if(n==0) return 1
    for(j<-1 to n){
      value=value*i
    }
    return value
 }

}
