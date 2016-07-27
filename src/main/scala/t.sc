val arr = Array(1,2,3,4,5,6,7)
val slid = arr.sliding(4).toArray.maxBy(_.sum).sum


val l = List(1,2,3,4,5,6)
val sl = l.sliding(4).toList

sl.maxBy(_.sum).product

val _2dArray = Array(Array(1,2,3,4,5,6,7,8), Array(0,1,2,3,4,5,6,7),Array(2,2,3,4,5,6,7,9))
_2dArray.sliding(4).toArray



val arr2 = Array(Array(1,2,3,4,5),Array(1,2,3,4,5),Array(3,4,5,6,7),Array(1,4,7,0,9),Array(9,8,0,9,9))

