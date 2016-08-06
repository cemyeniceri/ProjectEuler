/**
  * Created by cyeniceri  on 23.07.2016.
  */
class P5_SmallestMultiple {

  def findFactor(x: Int): Map[Int, Int]={
    def loop(count: Int, act: Int, divisor: Int, res: Map[Int, Int]): Map[Int, Int] = {
      if(act==0|| act==1)
        if(count==0)res else res + (divisor -> count)
      else{
        if(act%divisor==0){
          loop(count+1, if(act==divisor) 0 else act/divisor, divisor, res)
        }else
          loop(0, act, divisor+1, if(count==0)res else res + (divisor -> count))
      }
    }
    loop(0, x, 2, Map())
  }

  def smallestMultiple(): Int = {
    val listMap = (2 to 20).toList map(x=> x -> findFactor(x))

    val values = listMap.map(_._2)
    val flat = values.flatten.groupBy(_._1).values.map(x=> x.maxBy(_._2))
    flat.foldLeft(1)((x,y)=> x * scala.math.pow(y._1, y._2).toInt)
  }
}