import scala.io.StdIn

object Main{
  def main(args: Array[String]):Unit = {
    println(Math.pow(StdIn.readLine().toInt, 3).toInt)
  }
}
