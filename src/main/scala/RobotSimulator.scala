import scala.collection.mutable.ArrayBuffer

object RobotSimulator extends App {

  var x = args(1).toInt
  var y = args(2).toInt
  var orientation = args(3)
  val commands = args(0).split("").toList
  println(s"Robot is on $x and $y positions facing $orientation. Now robot is executing commands: $commands ")

  case class Robot(x: Int, y: Int, orientation: String)

  val robot = Robot(x = args(1).toInt, y = args(2).toInt, orientation = args(3))

  def turn(command: String): String = commands match {
    case "L" if orientation == "north" => orientation = "east"
    case "L" if orientation == "east" => orientation = "south"
    case "L" if orientation == "east" => orientation = "north"
    case "L" if orientation == "north" => orientation = "west"
    case "R" if orientation == "north" => orientation = "east"
    case "R" if orientation == "east" => orientation = "north"
    case "R" if orientation == "south" => orientation = "west"
    case "R" if orientation == "west" => orientation = "south"
  }

  def advance(command: String): (Int, Int) = orientation match {
    case "north" => (x, y + 1)
    case "east" => (x + 1, y)
    case "south" => (x, y - 1)
    case "west" => (x - 1, y)
  }

  commands.foldLeft(robot)(commands match {
    case "R" => turn(orientation)
    case "L" => turn(orientation)
    case "A" => advance(x, y)
  })

  println(s"Robots position is $x,$y facing $orientation?")
}