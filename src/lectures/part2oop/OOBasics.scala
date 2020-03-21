package lectures.part2oop

class OOBasics extends  App {
  val basicPerson = new BasicPerson("Matias", 32)
  println(basicPerson)

  val anotherPerson = new PersonWithFields("Matias", 32)
  println(anotherPerson.name)

  val person = new Person("Matias", 32)
  person.greet("Daniel")
  person.greet()
}

class BasicPerson(name: String, age: Int) // This are class parameters but NOT a field (i.e. can't be accesed by person.name)

class PersonWithFields(val name: String, val age: Int)

// constructor
class Person(name: String, val age: Int) {
  // body

  def greet(name: String): Unit = println(s"${this.name} says: Hi $name")

  def greet(): Unit = println(s"Hi, I am $name")
}
