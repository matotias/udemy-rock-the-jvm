package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else {
      println(s"Computing factorial of $n - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)
      result
    }
  }

  //println(factorial(10))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // THIS IS TAIL RECURSION = USE THE RECURSIVE CALL AS THE LAST EXPRESSION -> LESS PRONE TO STACKOVERFLOW ERRORS

    factHelper(n, 1)
  }

  //print(anotherFactorial(5000))

  // WHEN YOU NEED LOOPS, USE _TAIL_ RECURSION.

  def factorialFromMemory(n: Int): BigInt = {
    if (n <= 1) 1
    else n*factorialFromMemory(n - 1)
  }

  print(factorialFromMemory(5))

}

