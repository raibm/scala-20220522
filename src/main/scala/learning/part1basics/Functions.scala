package learning.part1basics

object Functions extends App {

  def makeString(a: String, b: Int) : String = {
    a + " " + b
  }

  println(makeString("44", 42))

  def noParametersFunction() : Int = 55

  println(noParametersFunction())
//  println(noParametersFunction) only works in Scala 2

  def recursiveFunction(value: String, n: Int): String = {
    if (n == 3)
      value
    else value + recursiveFunction(value, n+1)
  }

  println(recursiveFunction("lav", 0))

  // WHEN U USE SCALA, YOU NEED USE RECURSION TO LOOPS, NOT WHILE OR SOME SHITS LIKE THAT
}
