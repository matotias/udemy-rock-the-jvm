package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2

  println(10 >> 1)

  println(1 == x)

  var aVariable = 2
  aVariable += 3
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)
  // Instructions are executed: do something
  // Expressions are evaluated: give me the value of something

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // An if expression in scala gives back a value
  println(aConditionedValue)

  // Loops
  // There are loops in scala but are discouraged

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // THE ABOVE CODE SHOULDN'T BE USED
  // Everything in scala is an Expression! (Values!)

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // Side effects in scala return Unit. A side effect is a modification of the state of the program.
  // Example of side effects: println(), whiles, reassigning.
  // They are reminiscent of instructions in other languages but in scala they are expressions returning Unit


  // Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y +1

    if (z > 2) "hello" else "goodbye"
  }

  // Code blocks also are expressions. The value of the block is the value of its last expression
  // Code blocks can have its own definition of values. It has it's own scope.

  // Exercises:
  // 1. Difference between "hello world" vs println("hello world")?
  // R. hello world is an expression that returns that string while println is an expression that returns Unit

  // 2.
  // R. 42

}
