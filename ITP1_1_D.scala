import scala.io.StdIn

object Main{
  def main(args: Array[String]):Unit = {
    var time = StdIn.readLine().toInt
      val h = time / 3600
      time -= h*3600
      val m = time / 60
      time -= m*60
      val s = time
      println(s"$h:$m:$s")
  }
}
