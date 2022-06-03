package learning.part1basics

object Expressions extends App {

  val x: Int = 1 + 1
  println(x)

  println(1 + 1 * 49)

  println(1 == 2)

  println(!(1 == 2))

  println(!(1 == 2) && (2 == 2))


  var aVariable = 4
  aVariable += 4 // -= *= /= ... are the 'side effects'
  println(aVariable)


  ///////////////////// IMPORTANT //////////////////////////
    ///// INSTRUCTIONS (DO) VS EXPRESSIONS (VALUE) /////

    //SCALA USES EXPRESSION IF, NOT A INSTRUCTION IF, look under
    val aCondition = true
    val validCondition = if(aCondition) 5 else 3


  // EVERYTHING IN SCALA IS A EXPRESSION
  val aWeirdValue = (aVariable = 3) // type of aWeirdValue is "Unit", its like a "void" in Java

  var i = 0
  while (i < 10) {
    i += 1
    println(i)
  }

  val printableValue = {
    val z = 3
    val x = z + 4

    if (x > 4) "weee, it's works" else "no, it's doesn't works"
  }

  println(printableValue)

  ///////////////////// QUESTIONS //////////////////////////
  //1 - What's the difference between String "hello world" and println("hello world")
  //    R: In my opinion, hello world is a simple string value, while println() is a expression  (currect)

  //2 - Look these codes under, and give the correct answer of theirs
  //    R: first response: returns a boolean value true, second response: returns a int value 42
      val questionValue = { 3 > 2 }

      val quetionValue2 = {
        if (questionValue) 239 else 231
        42
      }

}
