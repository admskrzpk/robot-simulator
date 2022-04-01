var x = 7
var y = 3
var orientation = "north"
val command = "RAALAL".split("").toList

def robotMoving(s: List[String]): Unit = {
  s.foreach {
    case "L" => orientation match {
      case "north" => orientation = "west"
      case "east" => orientation = "north"
      case "south" => orientation = "west"
      case "west" => orientation = "south"
    }
    case "R" => orientation match {
      case "north" => orientation = "east"
      case "east" => orientation = "south"
      case "south" => orientation = "west"
      case "west" => orientation = "north"
    }
    case "A" => orientation match {
      case "north" => y = y + 1
      case "east" => x = x + 1
      case "south" => y = y - 1
      case "west" => x = x - 1
    }
  }
println(s"Robots position is $x,$y facing $orientation")
}

robotMoving(command)