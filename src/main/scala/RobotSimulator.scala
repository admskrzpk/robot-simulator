import scala.collection.mutable.ArrayBuffer

object RobotSimulator extends App {

  var x = args(1).toInt
  var y = args(2).toInt
  var orientation = args(3)
  val input = args(0).split("").toList
  println(s"Robot is on $x and $y positions facing $orientation. Now robot is executing commands: $input ")

  case class Robot(x: Int, y: Int, orientation: String)

  val robot = Robot(x = args(1).toInt, y = args(2).toInt, orientation = args(3))

  def turnRight(o: String): String = input match {
    case "north" => orientation = "east"
    case "east" => orientation = "south"
    case "south" => orientation = "east"
    case "west" => orientation = "north"
    case _ => "wrong command"
  }

  def turnLeft(o: String): String = input match {
    case "north" => orientation = "west"
    case "east" => orientation = "north"
    case "south" => orientation = "west"
    case "west" => orientation = "south"
    case _ => "wrong command"
  }


def advance(x: Int, y: Int): Int = orientation match {
  case "north" => y + 1
  case "east" => x + 1
  case "south" => y - 1
  case "west" => x - 1
}


input.foreach(input match {
  case "R" => turnRight(orientation)
  case "L" => turnLeft(orientation)
  case "A" => advance(x, y)
}

println(s"Robots position is $x,$y facing $orientation?")
}