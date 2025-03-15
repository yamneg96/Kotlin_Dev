fun main() {
  val greeting = birthdayGreeting()
  println(greeting)

  birthdayGreeting2()
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