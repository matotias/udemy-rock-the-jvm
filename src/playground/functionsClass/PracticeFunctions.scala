package playground.functionsClass

object PracticeFunctions extends App{
  /*
  1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old"
  2. Factorial function (!n)
  3. Fibonacci function
  4. Test if a number is prime
 */

  def greetingFunction(name: String, age: Int)= {
    println(s"Hi, my name is $name and I am $age years old")
  }
  greetingFunction("Matias", 30)

  def factorialFunction(n: Int): Int =
    if (n <= 0) 1
    else n * factorialFunction(n - 1)

  println(factorialFunction(0))
  println(factorialFunction(1))
  println(factorialFunction(3))
  println(factorialFunction(4))

  def fibonacciFunction(n: Int): Int =
    if (n <= 2) 1
    else fibonacciFunction(n - 2) + fibonacciFunction(n - 1)

  println(fibonacciFunction(0))
  println(fibonacciFunction(1))
  println(fibonacciFunction(2))
  println(fibonacciFunction(3))
  println(fibonacciFunction(4))
  println(fibonacciFunction(5))
  println(fibonacciFunction(6))

  def isItPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n/2)
  }

  println(isItPrime(6))
  println(isItPrime(37))
  println(isItPrime(112))
}
