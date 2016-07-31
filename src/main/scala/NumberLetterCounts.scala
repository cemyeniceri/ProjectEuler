/**
  * Created by cyeniceri on 30.07.2016.
  */
class NumberLetterCounts {

  val numberMap = Map(1 -> "One", 2 -> "Two", 3 -> "Three", 4 -> "Four", 5 -> "Five", 6 -> "Six", 7 -> "Seven", 8 -> "Eight", 9 -> "Nine")
  val tensMap = Map(10 -> "Ten", 11 -> "Eleven", 12 -> "Twelve", 13 -> "Thirteen", 14 -> "Fourteen", 15 -> "Fifteen", 16 -> "Sixteen", 17 -> "Seventeen", 18 -> "Eighteen", 19 -> "Nineteen")
  val decadeMap = Map(2 -> "Twenty", 3 -> "Thirty", 4 -> "Forty", 5 -> "Fifty", 6 -> "Sixty", 7 -> "Seventy", 8 -> "Eighty", 9 -> "Ninety")
  val hundredMap = Map(1 -> "One Hundred", 2 -> "Two Hundred", 3 -> "Three Hundred", 4 -> "Four Hundred", 5 -> "Five Hundred", 6 -> "Six Hundred", 7 -> "Seven Hundred", 8 -> "Eight Hundred", 9 -> "Nine Hundred")
  val thousand = Map(1000 -> "One Thousand")

  def eval (limit: Int): Int = {
    (1 to limit).foldLeft(0){(x,y)=>
      val evalStr = loop(y)
      x + evalStr.filterNot(_==' ').length
    }
  }

  def loop(number: Int): String = {
    val yStr = number.toString
    if(yStr.length==1)
      numberMap.getOrElse(number, "")
    else if(yStr.length==2 && yStr.startsWith("1"))
      tensMap.getOrElse(number, "")
    else if(yStr.length==2){
      decadeMap.getOrElse(number.toString.head.toString.toInt, "") + loop(yStr.tail.toInt)
    }else if(yStr.length==3){
      if(number%100==0)
        hundredMap.getOrElse(number.toString.head.toString.toInt, "")
      else
      hundredMap.getOrElse(number.toString.head.toString.toInt, "") + " and " + loop(yStr.tail.toInt)
    }else
      "One Thousand"
  }
}
