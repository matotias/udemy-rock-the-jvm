package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(person: Person): String = s"${this.name} plus ${person.name}"
    def unary_! : String = s"${name}!"
    def isAlive: Boolean = true
    def apply(): String = s"Hello, my name is $name and I like $favoriteMovie"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  // infix notation (operator notation): works for methods with a single parameter (example of syntactic sugar)
  println(mary likes "Inception")  // equivalent to the previous one

  // "operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary hangOutWith tom)
  println(mary + tom)

  // ALL OPERATORS ARE METHOD
  println(1 + 2)
  println(1.+(2))

  // prefix notation
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-

  // the unary_ prefix only works with - + ~ !
  println(!mary)
  println(mary.unary_!)

  // postfix notation: available to methods without parameters
  println(mary.isAlive)
  println(mary isAlive)

  // apply
  println(mary.apply())
  println(mary()) // equivalent

}
