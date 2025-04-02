fun main(args: Array<String>) {

  val a = 12
  val b = 13
  val max: Int
//Expressions are code that evaluates to a value.
//They consist of variables, literals, operators, and function calls.
  max = if (a > b) a else b//This is Expression.
  println("$max")

//Statements are everything that make up a complete unit of execution.

//Blocks: group of statements enclosed in curly braces.
  val max2 = if (a > b) {
    println("a is greater than b")
    a
  } else {
    println("b is greater than a")
    b
  }
  println("$max2")
}