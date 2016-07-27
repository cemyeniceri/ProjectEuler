/**
  * Created by cyeniceri on 25.07.2016.
  */
class SpecialPythagoreanTriplet {

  def findProd : Int = {
    val x = for{
      c <- 1 to 1000
      b <- 1 until c
      a <- 1 until b
      if(scala.math.pow(a,2) + scala.math.pow(b,2)== scala.math.pow(c,2))
      if(a+b+c==1000)
    }yield a*b*c
    x.head
  }
}
