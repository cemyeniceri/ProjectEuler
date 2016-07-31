/**
  * Created by Administrator on 31.07.2016.
  */
class FactorialDigitSum {

  def fact(n: Int): BigInt = {
    def loop(actNum: Int, acc:BigInt): BigInt = {
      if(actNum==1)
        acc
      else
        loop(actNum-1, acc*actNum)
    }
    loop(n, 1)
  }

  val digitSum = fact(100).toString.foldLeft(0)((x,y)=> x + y.toString.toInt)
}
