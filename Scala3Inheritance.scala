package ca.mcit.bigdata.scala

trait Shapee {
  def draw(): String
  def drawToConsole(): Unit = println(draw())
}
class Circle(r: Double) extends Shapee {
  override def draw(): String = s"this is a circle of radius $r with area ${area()}"
  def area(): Double = Constant.pi * r * r
}
class Cylinder(h: Double, r: Double) extends Circle (r) {
  override def draw(): String = s"this is a cilinder of area ${area()}"
  override def area(): Double = super.area() * 2 + (h * 2 * Constant.pi * r)
  def volume () : Double = super.area() * h
}
object Constant {
  val pi: Double= 3.14
}
class Square(l: Double, h: Double) extends Shapee {
  override def draw(): String = s"this is a square of lengh $l, height $h, of area ${area()}"
  def area(): Double = l * h
}
class SquareCuboid(w: Double, l: Double, h: Double) extends Square(l, h) {
  override def draw(): String = s"this is a squarecuboid of area ${area()}"
  override def area():  Double = super.area() * 6
  def volume (): Double = super.area() * w
}
object main extends App {
  val c1= new Circle(5)
  println(c1.draw())
  // val to cilincer
  // val to square
  // val to square cuboid
}