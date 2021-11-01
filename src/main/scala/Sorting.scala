class Sorting {

  def isort(xs: List[Int]): List[Int] = {
    xs match {
      case Nil => Nil
      case _   => insert(xs.head, isort(xs.tail))
    }
  }

  def insert(x:Int, xs:List[Int]): List[Int]={
    if(xs.isEmpty || x < xs.head)
      x::xs
    else
      xs.head :: insert(x, xs.tail)
  }
}

object Main extends App {

  val list = List(1, 14, 58, 3, 12)
  val isort = new Sorting()
  println(isort.isort(list))

}