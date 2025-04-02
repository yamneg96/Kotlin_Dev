fun main(args: Array<String>) {

  val number = -10
//Unlike in other programming languages,
//we can use the if statement as an expression in Kotlin.
  val result = if (number > 0) {
      "Positive number"
  } else {//is mandatory when using if as an expression
      "Negative number"
  }
  println(result)

  val num = -10
  val result2 = if (num > 0) "Positive number" else "Negative number"
  //this is similar to the ternary operator in Java
  println(result2)
}