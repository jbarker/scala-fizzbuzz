package com.jbarker.code.scala.fizzbuzz

import scala.collection.parallel.ParIterable

/**
 * Write a program that outputs the numbers from 1 to 100. But for multiples of
 * three output "Fizz" instead of the number, and for multiples of five output
 * "Buzz". For numbers which are multiples of both three and five output
 * "FizzBuzz".
 */
object FizzBuzz {

  val END_DEFAULT = 100

  val END_MAXIMUM = 100

  val START_DEFAULT = 1

  val START_MINIMUM = 1

  /*
   * Returns a parallel iterable for the integers in the range start to end.
   *
   * Corrects malformed input if detected.
   *
   * @param start an Integer, the start of the number range
   * @param end an Integer, the end of the number range
   *
   * @return a ParIterable, the integers in the defined range
   */
  private def getNumbers(start: Int, end: Int): ParIterable[Int] = {
    if (start < START_MINIMUM) {
      // set start to the minimum value when it less than the minimum value
      return getNumbers(START_MINIMUM, end)
    }
    if (END_MAXIMUM < end) {
      // set end to the maximum value when it is greater than the maximum value
      return getNumbers(start, END_MAXIMUM)
    }
    if (end < start) {
      // flip start and end values if they are not in the expected order
      return getNumbers(end, start)
    }

    start.to(end).par
  }

  /**
   * Returns the output of the FizzBuzz operation.
   *
   * Optional start and/or end integer may be provided.
   *
   * Corrects malformed input to be within allowed number range.
   *
   * @param start an Integer, the start of the number range
   * @param end an Integer, the end of the number range
   *
   * @return a String, the FizzBuzz result for the given number range
   */
  def getResult(start: Int = START_DEFAULT, end: Int = END_DEFAULT) : String = {
    getNumbers(start, end).par.map(inputToOutput).mkString(" ")
  }

  /*
   * Maps an integer to its FizzBuzz string value.
   *
   * @param input an Integer
   * @return s String, the FizzBuzz output for the given integer
   */
  private def inputToOutput(input: Int): String = {
    var result: String = ""
    if (input % 3 == 0) {
      // for multiples of three output "Fizz"
      result += "Fizz"
    }
    if (input % 5 == 0) {
      // for multiples of five output "Buzz"
      result += "Buzz"
    }
    if (0 == result.length) {
      // output the number
      result = input.toString
    }

    result
  }

  def main(args: Array[String]) = {
	println(getResult())
  }

}
