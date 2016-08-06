/**
  * Created by cyeniceri on 23.07.2016.
  */
class P7_10001stPrime {
  def findNthPrime(n: Int): Long = {
    def loop(count: Int, nextPrime: Long): Long = {
      if(count == n)
        nextPrime
      else
        if(isPrime(nextPrime + 1L)) loop(count+1, nextPrime+1) else loop(count, nextPrime+1)
    }
    loop(1,2)
  }

  def isPrime(n: Long): Boolean = {
    val rootNumber = scala.math.pow(n, 0.5)
    (2 to rootNumber.toInt).forall(n%_!=0)
  }
}
