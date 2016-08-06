/**
  * Created by cyeniceri on 25.07.2016.
  */
class P10_SummationOfPrimes {

  def isPrime(n: Long): Boolean = {
    val rootNumber = scala.math.pow(n, 0.5)
    (2 to rootNumber.toInt).forall(n%_!=0)
  }

  def sum(n: Int): Long = {
    (2 until n).foldLeft(0L)((x,y) => x.+(if(isPrime(y))y else 0))
  }
}
