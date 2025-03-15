fun main() {
  val greeting = birthdayGreeting()
  println("$greeting \n")

  //println(birthdayGreeting());
  birthdayGreeting2()

  val greeting3 = birthdayGreeting3("Yamlak")
  println("\n $greeting3")
}

fun birthdayGreeting2() {
  println("Happy Birthday, Howard!")
  println("You are now 5 years old!")
}

fun birthdayGreeting(): String {
  val nameGreeting = "Happy Birthday, Rover!"
  val ageGreeting = "You are now 5 years old!"
  return "$nameGreeting\n$ageGreeting"
}

fun birthdayGreeting3(name: String): String {
  val nameGreeting = "Happy Birthday, $name!"
  val ageGreeting = "You are now 20 years old!"
  return "$nameGreeting\n$ageGreeting"
}


/*
Note: Although you often find them used interchangeably, 
a parameter and an argument aren't the same thing. 
When you define a function, you define the parameters 
that are to be passed to it when the function is called. 
When you call a function, you pass arguments for the parameters. 
Parameters are the variables accessible to the function, such as 
a name variable, while arguments are the actual values that you pass, 
such as the "Rover" string.


Unlike in some languages, such as Java, where a function can change 
the value passed into a parameter, parameters in Kotlin are immutable. 
You cannot reassign the value of a parameter from within the function body.
 */