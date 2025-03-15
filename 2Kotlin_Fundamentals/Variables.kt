fun main(args : Array<String>) {
  val range: Byte = 112
  println("$range")

  val unreadCount = 5
  val readCount = 100
  println("You have ${unreadCount + readCount} total messages in your inbox.")
  // The code below gives error. Why?
  // val range1: Byte = 200

  val numberOfPhotos = 100
    val photosDeleted = 10
    println("$numberOfPhotos photos")
    println("$photosDeleted photos deleted")
    println("${numberOfPhotos - photosDeleted} photos left")

//Other DataTypes
val notificationsEnabled: Boolean = false
    println("Are notifications enabled? " + notificationsEnabled)

    val myName: String = "John"
    println("My name is $myName")
  

    val nextMeeting = "Next meeting: "
    val date = "January 1"
    val reminder = nextMeeting + date + " at work"
    println(reminder)
}