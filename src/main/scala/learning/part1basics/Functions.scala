package learning.part1basics

object Functions extends App {

  def makeString(a: String, b: Int): String = {
    a + " " + b
  }

  println(makeString("44", 42))

  def noParametersFunction(): Int = 55

  println(noParametersFunction())
  //  println(noParametersFunction) only works in Scala 2

  def recursiveFunction(value: String, n: Int): String = {
    if (n == 3)
      value
    else value + recursiveFunction(value, n + 1)
  }

  println(recursiveFunction("lav", 0))

  // WHEN U USE SCALA, YOU NEED USE RECURSION TO LOOPS, NOT WHILE OR SOME SHITS LIKE THAT


  def someSideSimpleFuctioEffect(firstParam: Int, secondParam: Int) = firstParam + secondParam

  def simpleFunctionWithFuctionInside(x: String, z: String, y: String): String = {
    def insideFunc(one: String, two: String, three: String) = one + two + three

    insideFunc(x, z, y)
  }

  println(simpleFunctionWithFuctionInside("ba", "na", "na"))

  //1. A greeting function (name, age) => "Hi, my name is $name and I'm $age years old.
  //2. Factoral function 1 * 2 * 3 ... * n
  //3. A Finonacci function
  //   f(1) = 1
  //   f(2) = 1
  //   f(n) = f(n - 1) + f(n - 2)
  //4. Test if a number is prime.


  //1. A greeting function (name, age) => "Hi, my name is $name and I'm $age years old.
  def nameAgeFunction(name: String, age: Int): String = s"Hi, my name is $name and I'm $age years old."
  println(nameAgeFunction("Rai", 25))

  //2.Factoral function 1 * 2 * 3 ... * n
  def factorialFunction(n: Int): Int = {
    if (n <= 0) 1
    else n * factorialFunction(n - 1)
  }
  println(factorialFunction(5))

  //3. A Fibonacci function
  //   f(1) = 1
  //   f(2) = 1
  //   f(n) = f(n - 1) + f(n - 2)
  def fibonacciFunction(n1: Int): Int = {
    if(n1 <= 1) 1
    else fibonacciFunction(n1-1) + fibonacciFunction(n1-2)
  }
  println(fibonacciFunction(8))

  //4. Test if a number is prime.
  def isPrime(n: Int): Boolean = {
    def untilPrime(t: Int): Boolean = {
      if(t <= 1) true
      else n % t != 0 && untilPrime(t-1)
    }
    untilPrime(n/2)
  }

  println(isPrime(37))
}