fun main(args: Array<String>) {

  val number1 = 12.5
  val number2 = 3.5
  var result: Double

  result = number1 + number2
  println("number1 + number2 = $result")

  result = number1 - number2
  println("number1 - number2 = $result")

  result = number1 * number2
  println("number1 * number2 = $result")

  result = number1 / number2
  println("number1 / number2 = $result")

  result = number1 % number2
  println("number1 % number2 = $result")


  val start : String = "Talk is cheap. "
    val middle : String = "Show me the code. "
    val end : String = "- Linus Torvalds"

    val result2 = start + middle + end
    println(result2)



    val a = 1
    val b = true
    var c = 1

    var result3: Int
    var booleanResult: Boolean

    result3 = -a
    println("-a = $result3")

    booleanResult = !b
    println("!b = $booleanResult")

    --c
    println("--c = $c")


    val e = -12
    val f = 12

    // use of greater than operator
    val max = if (e > f) {
        println("e is larger than f.")
        e
    } else {
        println("f is larger than e.")
        f
    }

    println("max = $max")
}