import scala.io.StdIn

object Main{
  def main(args: Array[String]):Unit = {
    val Array(a, b, c, _*) = StdIn.readLine().split(' ').map(_.toInt)

    if( a < b && b < c) println("Yes")
    else println("No")
  }
}
