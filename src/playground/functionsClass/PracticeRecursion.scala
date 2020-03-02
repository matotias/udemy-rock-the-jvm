package playground.functionsClass
import scala.annotation.tailrec

object PracticeRecursion extends App {

  //def concatenateString(aString: String, x: Int, accumulator: String): String =
  //  if (x<=0) accumulator
  //  else concatenateString(aString, x - 1, aString + accumulator)

  //println(concatenateString("Hola", 8,  ""))

  // Recursion exercises
  def concatenateString(aString: String, x: Int): String = {
    @tailrec
    def concatStringHelper(s: String, n: Int, accumulator: String): String = {
      if (n<=0) accumulator
      else concatStringHelper(s, n - 1, accumulator + s)
    }
    concatStringHelper(aString, x, "")
  }
  //println(concatenateString("Pepe", 3))

  def isPrimeRecursive(n: Int): Boolean = {
    @tailrec
    def isPrimeHelper(x: Int, accumulator: Int): Boolean = {
      if (x == accumulator) true
      else if (x % accumulator == 0) false
      else isPrimeHelper(x, accumulator + 1)
    }
    if (n <= 1) false
    else isPrimeHelper(n, 2)
  }

  println(isPrimeRecursive(29))


  def RegularFibonacci(n: Int): Int = {
    if (n <= 2) 1
    else RegularFibonacci(n - 1) + RegularFibonacci(n - 2)
  }

  println(RegularFibonacci(7))



  def FibonacciRecursive(n: Int): Int = {
    def FibonacciHelper(i: Int, oneStepPrev: Int, TwoStepPrev: Int): Int = {
      if (i >= n) oneStepPrev
      else FibonacciHelper(i + 1, oneStepPrev + TwoStepPrev, oneStepPrev)
    }

    if ( n <= 2 ) 1
    else FibonacciHelper(2, 1, 1)
  }

  //println(FibonacciRecursive(3))
}

// 2 % 2