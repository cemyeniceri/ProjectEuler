/**
  * Created by cyeniceri on 23.07.2016.
  */
class P6_SumSquareDifference {

  def diff(range: Range): Int = {
    val  sumOfTheSquares = range.foldLeft(0)((x,y)=> x + scala.math.pow(y, 2).toInt)
    val  squareOfTheSum = scala.math.pow(range.sum , 2)
    (squareOfTheSum - sumOfTheSquares).toInt
  }
}
