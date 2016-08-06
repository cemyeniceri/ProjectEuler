import java.util.Date

/**
  * Created by cyeniceri on 22.07.2016.
  */
object Test extends App{

  val start = System.currentTimeMillis()
  println(new P20_FactorialDigitSum().digitSum)
  println(System.currentTimeMillis() - start)

  println(new P4_LargestPalindromeProduct().generateMaxProduct())
  println(new P17_NumberLetterCounts().eval(1000))
  println(new P14_LongestCollatzSequence().findLongest)
  println(new P16_PowerDigitSum().res)
  println(new P13_LargeSum().findSum)
  println(new P12_HighlyDivisibleTriangularNumber().findHighlyDivisibleTriangularNumber(500))
  println(new P11_LargestProductInGrid().retrieveMax)
  println(new P10_SummationOfPrimes().sum(10))
  println(new P9_SpecialPythagoreanTriplet().findProd)
  println(new P8_LargestProductInSeries().maxProd(13))
  println(new P7_10001stPrime().findNthPrime(10001))
  println(new P6_SumSquareDifference().diff(0 to 100))
  println(new P5_SmallestMultiple().smallestMultiple())
  println(new P5_SmallestMultiple().findFactor(16))
  println(new P5_SmallestMultiple().findFactor(18))
  println(new P5_SmallestMultiple().findFactor(20))
  println(new P5_SmallestMultiple().findFactor(24))
  println(new P5_SmallestMultiple().findFactor(125))
}