package lectures.part1basics

object StringOps extends App {
  val str: String = "Hello, I am learning Scala"
  println(str.charAt(13))
  println(str.substring(7,12))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "/"))
  println(str.toLowerCase())
  println(str.toUpperCase())
  println(str.length)

  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println('a' + aNumberString + 'z')
  println(str.reverse)
  println(str.take(2))

  // S-Interpolators
  val anotherString = s"Hello I am $aNumberString and I would like to be ${aNumber + 20}"
  println(anotherString)


  // F-Interpolators
  val name = "Pepe"
  val burgersPerMinute = 1.2f
  val myth = f"$name%s can eat $burgersPerMinute%2.3f burgers per minute"
  println(myth)

  // Raw-Interpolators
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")
}
