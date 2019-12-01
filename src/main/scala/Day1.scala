import scala.io.Source

object Day1 {

  def requiredFuel(mass: Option[Int]): Int = {
    mass.get/3-2
  }

  def toInt(s: String): Option[Int] = {
    try {
      Some(s.toInt)
    } catch {
      case e: Exception => None
    }
  }

  def requiredFuelTotal(mass: Int): Int = {
    val fuel = mass / 3 - 2

    if(fuel <= 0) 0
    else fuel + requiredFuelTotal(fuel)
  }

  private def task1(): Unit = {
    val output1 = Source.fromResource("day1.txt")
      .getLines()
      .map(s => toInt(s))
      .filter(p => p.isDefined)
      .map(mapped => requiredFuel(mapped))
      .sum
    println(s"Task 1: $output1")
  }

  private def task2(): Unit = {
    val output2 = Source.fromResource("day1.txt")
      .getLines()
      .map(s => toInt(s))
      .filter(p => p.isDefined)
      .map(mapped => requiredFuelTotal(mapped.get))
      .sum
    println(s"Task 2: $output2")
  }

  def main(args: Array[String]): Unit = {
    task1()
    task2()
  }
}

