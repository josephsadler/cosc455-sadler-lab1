  println("Hello Scala")

  1+1

  val day: Int = 1

  var num: Int = 2

  num = 6

def FizzBuzz(n: Int): Unit = {
  1 to n foreach {i =>
    println((i % 3, i % 5) match {
        case(0,0) => "FizzBuzz"
        case(0, _) => "Fizz"
        case(_, 0) => "Buzz"
        case _ => i
    })
  }
}
  FizzBuzz(15)