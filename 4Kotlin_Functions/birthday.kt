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