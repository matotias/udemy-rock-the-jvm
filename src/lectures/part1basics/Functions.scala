package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterLessFunction(): Int = 42
  // A function without parameters can be called with or without parenthesis:
  println(aParameterLessFunction())
  println(aParameterLessFunction)

  // A function that concatenates a String n times (with no loops!)
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }
  println(aRepeatedFunction("mouse ", 5))
  // WHEN YOU NEED LOOPS USE RECURSION --  RECURSIVE FUNCTIONS
  // When the function is non recursive, then return type isn't needed
  // If the function is recursive, then you need to specify the return type, because the compiler can't figure it out

  /*
    1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old"
    2. Factorial function (!n)
    3. Fibonacci function
    4. Test if a number is prime
   */

}
