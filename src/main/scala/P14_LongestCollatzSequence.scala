/**
  * Created by cyeniceri on 30.07.2016.
  */
class P14_LongestCollatzSequence {

  def eval(number: Long, count: Long): Long = {
    if(number==1)
      count
    else if(number%2==0)
      eval(number/2, count+1)
    else
      eval((number*3)+1, count+1)
  }



  def findLongest = (3 to 1000000 by 2).map(x=> eval(x,0) -> x).maxBy(_._1)._2
}
