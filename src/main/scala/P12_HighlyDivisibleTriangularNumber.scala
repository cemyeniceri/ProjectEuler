/**
  * Created by cyeniceri on 28.07.2016.
  */
class P12_HighlyDivisibleTriangularNumber {

  def findHighlyDivisibleTriangularNumber(limit: Int): Long= {
    def loop(divisorNum: Int, actualNumber: Long, inc: Int): Long ={
      if(divisorNum>limit)
        actualNumber
      else
        loop(findDivisor(actualNumber + inc), actualNumber + inc, inc+1)
    }
    loop(0, 1, 2)
  }


  def findDivisor(number: Long): Int = {
    val rootedNumer = scala.math.pow(number, 0.5)
    (1L to rootedNumer.toLong).count(number % _ == 0)*2
  }

}
