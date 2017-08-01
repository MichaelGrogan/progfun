package recfun

object Main {
  def main(args: Array[String]) {
    /*
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
    */
    testBalance()
  }

  def testBalance(): Unit ={
    val str1 = "()"
    val str2 = "(("
    val str3 = ")"


    println(str1 + " : " + balance(str1.toList))
    println(str2 + " : " + balance(str2.toList))
    println(str3 + " : " + balance(str3.toList))
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if(c == 0) 1
      else if(c == r) 1
      else pascal(c, r-1) + pascal(c-1, r-1 )
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def accBalance(chars: List[Char], openBraces: Int):Boolean = {
        if (chars.isEmpty) openBraces == 0
        else if (chars.head == '(') accBalance(chars.tail, openBraces + 1)
        else if (chars.head != ')') accBalance(chars.tail, openBraces)
        else if (openBraces == 0)  false
        else accBalance(chars.tail, openBraces - 1)


      }
      accBalance(chars, 0)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      
    }
  }
