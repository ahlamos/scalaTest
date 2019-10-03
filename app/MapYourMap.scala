package com.particeep.test

/**
  * Tell developer names by the department code
  * Expected result:
  * Map(frontend -> List(Remy, Alexandre), analytics -> List(Pierre), api -> List(Noe))
  */

import scala.collection.mutable.ListBuffer
object MapYourMap {

      val devNames = Map("dev1" -> "Pierre", "dev2" -> "Remy", "dev3" -> "Noe", "dev4" -> "Alexandre")
      val devDepartments = Map("dev1" -> "analytics", "dev2" -> "frontend", "dev3" -> "api", "dev4" -> "frontend")
      
        
      def DepartmentsResult(departments:Map[String,String],names:String):List[String]={
          var resultDept = new ListBuffer[String]()
          departments foreach {case (key, value) => {
            if(value == names)
                {resultDept+=key}
            }
    
          }
        return resultDept.toList
      }
  
      def NamesResult(listDept:List[String],mapNames:Map[String,String]):List[String]={
          var resultName = new ListBuffer[String]()
          for (element <- listDept) {
          if(mapNames.exists(x => x._1 == element)==true)
              resultName+=devNames(element)
          }
          return resultName.toList
        }
      
      def nameInDepartmentFonction(devNames:Map[String,String],devDepartments:Map[String,String]):Map[String,List[String]]={
          var result:Map[String,List[String]]=Map()
          devDepartments foreach {case (key, value) => {
            var resultDept:List[String]= DepartmentsResult(devDepartments,value)
            var resultName:List[String]= NamesResult(resultDept,devNames)
            result = result + (value ->resultName)
        
          }
    
          }
        return result
       }


  val namesInDepartments:Map[String, List[String]] = nameInDepartmentFonction(devNames,devDepartments)import scala.collection.mutable.ListBuffer
}