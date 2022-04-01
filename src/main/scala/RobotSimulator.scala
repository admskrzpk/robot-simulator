object RobotSimulator extends App {

  var x = args(1)
  var y = args(2)
  var orientation = args(3)
  val input = args(0).split("").toList
  println(s"Robot is on $x and $y positions facing $orientation. Now robot is executing commands: $input ")


  val directions = Seq("north", "east", "south", "west")


  def turn (r: String) = r match {
    case "R" => orientation match {
      case "north" => "east"
      case "east" => "south"
      case "south" => "east"
      case "west" => "north"
    }
    case "L" => orientation match {
      case "north" => "west"
      case "east" => "north"
      case "south" => "west"
      case "west" => "south"
    }
  }

  def advance(a: String) = a match {
    case
  }

  //def instructionsReader(instructions: String) = ???


  /*
  input.foldleft(?) {(?,?) => ? match {
  case "R" => turnRight(robot)
  case "L" => turnLeft(robot)
  case "A" => advance(robot)
  }
  println("Robots new position is x,y facing ?"

   */

}
