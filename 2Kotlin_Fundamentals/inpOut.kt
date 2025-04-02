//We use the readline() function to take input from the user in Kotlin.
/*This function is used for strings
for the others we can import the java Scanner and use it as usual with little modification. */

import java.util.Scanner
fun main(args: Array<String>) {
  print("Enter text: ")

  val stringInput = readLine()!!
  println("You entered: $stringInput")

  // Creates an instance(Object) which takes input from standard input (keyboard)
  val reader = Scanner(System.`in`)
  print("Enter a number: ")

  // nextInt() reads the next integer from the keyboard
  var integer:Int = reader.nextInt()

  println("You entered: $integer")
}
//Println() and print() are used for outputs.
/*
When you use println() function, it calls System.out.println() function internally. 
(System.out.println() is used to print output to the screen in Java). */