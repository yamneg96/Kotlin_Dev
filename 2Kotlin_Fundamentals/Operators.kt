fun main(args: Array<String>) {
  val number1 = 12.5
  val number2 = 3.5
  var result = number1 + number2
  println("number3 = $_@number3")
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


    val g = 12
    val h = 5
    val k = -1
    val result: Boolean

    // result is true is a is largest
    result = (g>h) && (g>k) // result = (a>b) and (a>c)
    println(result)


    //Example: in Operator.
    val numbers = intArrayOf(1, 4, 42, -3)

    if (4 in numbers) {
        println("numbers array contains 4.")
    }


    val r  = intArrayOf(1, 2, 3, 4, - 1)
    println(r[1])   
    r[1]= 12
    println(r[1])
}

/*
Bitwise Operation
Unlike Java, there are no bitwise and bitshift operators in Kotlin. To perform these task, various functions (supporting infix notation) are used:

shl - Signed shift left
shr - Signed shift right
ushr - Unsigned shift right
and - Bitwise and
or - Bitwise or
xor - Bitwise xor
inv - Bitwise inversion */
