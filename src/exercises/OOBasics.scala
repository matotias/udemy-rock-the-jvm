package exercises
import scala.annotation.tailrec

object OOBasics extends App {
  val pabloNeruda = new Writer("Pablo", "Neruda", 1904)
  val pepito = new Writer("Pepito", "Rey", 1904)
  val alturasDeMachuPicchu = new Novel("Alturas de Machu Picchu", 1950, pabloNeruda)
  println(alturasDeMachuPicchu.authorAge())
  println(alturasDeMachuPicchu.isWrittenBy(pepito))
  println(alturasDeMachuPicchu.isWrittenBy(pabloNeruda))

  val alturasSecondEdition = alturasDeMachuPicchu.copy(2020)
  println(alturasSecondEdition.yearOfRelease)

  val counter = new Counter(1)
  val secondCounter = counter.increment(3)

  println(secondCounter.currentCount())
}

class Writer (val firstName: String, val surname: String, val yearOrBirth: Int) {
  def fullName(): String = s"$firstName $surname"
}

class Novel(val name: String, val yearOfRelease: Int, author: Writer) {
  def authorAge(): Int = this.yearOfRelease - this.author.yearOrBirth

  def isWrittenBy(author: Writer): Boolean = author.fullName() == this.author.fullName()

  def copy(yearOfRelease: Int): Novel = new Novel(name, yearOfRelease, author)

}


class Counter(val number: Int) {
  def currentCount(): Int = number

  def increment(): Counter = {
    println("incrementing")
    new Counter(number + 1)
  }

  def decrement(): Counter = {
    println("decrementing")
    new Counter(number - 1)
  }

  def increment(n: Int): Counter = {
      if (n <= 0) this
      else increment().increment(n - 1)  // the first increment() returns a new counter with number + 1 and then over that instance it runs increment(n - 1)

  }

  def decrement(n: Int): Counter = {
    if (n <= 0) this
    else decrement().decrement(n - 1)

  }
}