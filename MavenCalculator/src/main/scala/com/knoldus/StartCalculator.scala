package com.knoldus

import scala.io.StdIn.readInt

object StartCalculator {
  def main(args: Array[String]): Unit = {
    print("***************Calculator****************\n")
    val calculate = new CalculatorImplementation
    print("1. Add\n")
    print("2. Subtract\n")
    print("3. Multiplication\n")
    print("4. Division\n")
    print("5. Power\n")
    print("6. Absolute\n")
    print("7. Modulus\n")
    print("8. Maximum of Two\n")
    print("9. Minimum of Two\n")
    print("Select operation 1-9 : ")
    val operation = readInt()
    calculate.selectOperations(operation)
  }

}
