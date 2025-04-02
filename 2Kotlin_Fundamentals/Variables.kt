fun main(args : Array<String>) {
  //Variable Decalration is only possible if specified explicitly.
  var language : String //Declaration
  language = "Kotlin"  //Initialization
  println("Language is $language")

  //The Kotlin Compiler understands implicitly the type of the variable.
  //We can also explicitly define the type of the variable.
  val range1: Byte = 112
  println("$range1 is Byte data type.")

  val range2: Short = 32767
  println("$range2 is Short data type.")

  val range3: Int = 2147483647
  println("$range3 is Int data type.")

  val range4: Long = 9223372036854775807
  println("$range4 is Long data type.")

  val range5: Float = 3.40282347E38F
  println("$range5 is Float data type.")

  //Unlike Java Characters aren't numbers in Kotlin.
  //They are a separate type. The Char type represents a single character. It is a 16-bit unsigned integer value.
  //The range of Char is from '\u0000' to '\uffff' (0 to 65535).
  val range6: Double = 1.7976931348623157E308
  println("$range6 is Double data type.")

  val range7: Char = 'A'
  println("$range7 is Char data type.")

  val range8: Boolean = true
  println("$range8 is Boolean data type.")

  //String is a class in Kotlin. It is not a primitive data type.
  //It is a sequence of characters. It is immutable.
  val range9: String = "Hello World!"
  println("$range9 is String data type.")
  //An array is a container that holds data (values) of one single type. For example, you can create an array that can hold 100 values of Int type.
  //In Kotlin, arrays are represented by the Array class. The class has get and set functions, size property, and a few other useful member functions.


}