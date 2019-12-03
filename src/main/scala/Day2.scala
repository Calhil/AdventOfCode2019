import scala.io.Source
import scala.util.control.Breaks

object Day2 {

  def task1(input: Array[Int]): Array[Int] = {
    Breaks.breakable {
      for (element <- input.sliding(4, 4)) {
        element(0) match {
          case 1 => input(element(3)) = input(element(1)) + input(element(2))
          case 2 => input(element(3)) = input(element(1)) * input(element(2))
          case 99 => Breaks.break()
          case _ => ;
        }
      }
    }
    input
  }

  private def getInput: Array[Int] = {
    Source.fromResource("day2.txt")
        .getLines()
        .next()
        .split(",")
        .map(_.toInt)
  }

  def main(args: Array[String]): Unit = {
    val input = getInput
    input(1) = 12
    input(2) = 2

    println(task1(input).mkString(","))
  }
}
