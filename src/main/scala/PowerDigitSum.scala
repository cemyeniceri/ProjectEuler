/**
  * Created by cyeniceri on 30.07.2016.
  */
class PowerDigitSum {

  val exp20:BigInt = 32768*32
  val exp1000 = exp20.pow(50)

  def res = exp1000.toString().takeWhile(_!='E').filterNot(_=='.').toList.foldLeft(0)((x,y)=> x+ y.toString.toInt)
}
