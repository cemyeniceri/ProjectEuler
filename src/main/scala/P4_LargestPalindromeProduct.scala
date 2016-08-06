/**
  * Created by cyeniceri on 22.07.2016.
  */
class P4_LargestPalindromeProduct {

  def isPallindrome(str: String) = str == str.reverse

  def isDivisible(number: Int): Boolean = {
    val divisor = (100 to 999).toList
    val isDivisibleFirstTerm = divisor.filter(number%_==0)
    val res = if(isDivisibleFirstTerm.nonEmpty)isDivisibleFirstTerm.find(x=> (number/x).toString.length==3) else None
      res.isDefined
  }

  def generateMaxProduct(): Int = {
    def loop(maxProduct: Int): Int = {
      if(isPallindrome(maxProduct.toString) && isDivisible(maxProduct))
        maxProduct
      else
        loop(maxProduct-1)
    }
    loop(999*999)
  }
}
