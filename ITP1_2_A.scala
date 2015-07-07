import scala.io.StdIn

object Main{
  def main(args: Array[String]):Unit = {
    val Array(a, b, _*) = StdIn.readLine().split(' ').map(_.toInt)

    if(a<b) println("a < b")
    else if(a>b) println("a > b")
    else if(a==b) println("a == b")
  }
}
