fun main() {

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

    // The + operator can also be used to concatenate strings
    val start = "Talk is cheap. "
    val middle = "Show me the code. "
    val end = "- Linus Torvalds"

    val result2 = start + middle + end
    println(result2)

    var b = true
    var c = 1
    println("c = $c")
    var d = +c
    println("d = $d")
    var e = -c
    println("e = $e")
    var f = ++c
    println("f = $f")
    var g = --c
    println("g = $g")
    var h = c++
    println("c(incremented after assigned to h.) = $c")//c is incremented after the value is assigned to h
    println("h = $h")//different from f in the order of operations meaninig c is incremented after the value is assigned to h
    var i = !b
    println("i = $i")//negation operator

    //in Operator
    val numbers = intArrayOf(1, 4, 42, -3)
//intArrayOf is a function that creates an array of integers.
    if (4 in numbers) {
        println("numbers array contains 4.")
    }

    //Index access Operator
    val numbers2 = intArrayOf(1, 4, 42, -3)
    println("numbers2[0] = ${numbers2[0]}")//index access operator is used to access the element at index 0 of the numbers2 array.
    numbers2[0] = 10//index access operator is used to assign the value 10 to the element at index 0 of the numbers2 array.
    println("numbers2[0] = ${numbers2[0]}")//index access operator is used to access the element at index 0 of the numbers2 array.

//Later on SEE about index access operator and Invoke Operator.
}