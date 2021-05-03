package part1recap

object ScalaRecap extends App {

  // values and variables
  val aBoolean: Boolean = false

  // expressions
  val anIfExpression = if(2 > 3) "bigger" else "smaller"

  // instructions vs expressions
  val theUnit = println("Hello, Scala") // this expression returns an Unit = "No meaningful value" = void in other languages

  // functions
  def myFunction(x: Int)  = 42

  // OOP
  class Animal
  class Dog extends Animal
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore{
    override def eat(animal: Animal): Unit = println("Crunch")
  }

  // singleton pattern
  object MySingleton
  // companions
  object Animal

  // method notation
  val x = 1 + 2
  val y = 1.-(2)

  // Functional Programming
  val incrementer: Int => Int = x => x + 1
  val incremented = incrementer(42)

  // map, flatmap, filter
  val processdList = List(1,2,4).map(incrementer)
  println(processdList)

  // Pattern Matching
  val unknown: Any = 45
  val ordinal  = unknown match {
    case 1 => "First"
    case 2 => "second"
    case _ => "unknown"
  }

  // try-catch
  try{
    throw new NullPointerException
  } catch {
    case _: NullPointerException => "some returned value"
    case _ => "something else"
  }
}
