package com.jbarker.code.scala.fizzbuzz

import org.junit.Assert
import org.junit.BeforeClass
import org.junit.Test

/**
 * Unit tests for FizzBuzz.
 */
class FizzBuzzTest {

  @BeforeClass
  val fizzBuzz = FizzBuzz

  @Test def testGetResult_baseCase() {
    val expected = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz " +
    		"16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz " +
    		"31 32 Fizz 34 Buzz Fizz 37 38 Fizz Buzz 41 Fizz 43 44 FizzBuzz " +
    		"46 47 Fizz 49 Buzz Fizz 52 53 Fizz Buzz 56 Fizz 58 59 FizzBuzz " +
    		"61 62 Fizz 64 Buzz Fizz 67 68 Fizz Buzz 71 Fizz 73 74 FizzBuzz " +
    		"76 77 Fizz 79 Buzz Fizz 82 83 Fizz Buzz 86 Fizz 88 89 FizzBuzz " +
    		"91 92 Fizz 94 Buzz Fizz 97 98 Fizz Buzz"
    val actual = fizzBuzz.getResult()
    Assert.assertEquals(expected, actual)
  }

  @Test def testGetResult_endBeforeStart() {
    val expected = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz"
    val actual = fizzBuzz.getResult(10, 1)
    Assert.assertEquals(expected, actual)
  }

  @Test def testGetResult_endDefault() {
    val expected = "91 92 Fizz 94 Buzz Fizz 97 98 Fizz Buzz"
    val actual = fizzBuzz.getResult(91)
    Assert.assertEquals(expected, actual)
  }

  @Test def testGetResult_endLarge() {
    val expected = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz " +
    		"16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz " +
    		"31 32 Fizz 34 Buzz Fizz 37 38 Fizz Buzz 41 Fizz 43 44 FizzBuzz " +
    		"46 47 Fizz 49 Buzz Fizz 52 53 Fizz Buzz 56 Fizz 58 59 FizzBuzz " +
    		"61 62 Fizz 64 Buzz Fizz 67 68 Fizz Buzz 71 Fizz 73 74 FizzBuzz " +
    		"76 77 Fizz 79 Buzz Fizz 82 83 Fizz Buzz 86 Fizz 88 89 FizzBuzz " +
    		"91 92 Fizz 94 Buzz Fizz 97 98 Fizz Buzz"
    val actual = fizzBuzz.getResult(1, 10000)
    Assert.assertEquals(expected, actual)
  }

  @Test def testGetResult_endNegative() {
    val expected = "1"
    val actual = fizzBuzz.getResult(1, -10)
    Assert.assertEquals(expected, actual)
  }

  @Test def testGetResult_startAndEndLarge() {
    val expected = "Buzz"
    val actual = fizzBuzz.getResult(10000, 20000)
    Assert.assertEquals(expected, actual)
  }

  @Test def testGetResult_startAndEndNamed() {
    val expected = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz " +
    		"16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz " +
    		"31 32 Fizz 34 Buzz Fizz 37 38 Fizz Buzz 41 Fizz 43 44 FizzBuzz " +
    		"46 47 Fizz 49 Buzz Fizz 52 53 Fizz Buzz 56 Fizz 58 59 FizzBuzz " +
    		"61 62 Fizz 64 Buzz Fizz 67 68 Fizz Buzz 71 Fizz 73 74 FizzBuzz " +
    		"76 77 Fizz 79 Buzz Fizz 82 83 Fizz Buzz 86 Fizz 88 89 FizzBuzz " +
    		"91 92 Fizz 94 Buzz Fizz 97 98 Fizz Buzz"
    val actual = fizzBuzz.getResult(end = 100, start = 1)
    Assert.assertEquals(expected, actual)
  }

  @Test def testGetResult_startAndEndNegative() {
    val expected = "1"
    val actual = fizzBuzz.getResult(-10, -1)
    Assert.assertEquals(expected, actual)
  }

  @Test def testGetResult_startDefault() {
    val expected = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz"
    val actual = fizzBuzz.getResult(end = 10)
    Assert.assertEquals(expected, actual)
  }

  @Test def testGetResult_startNegative() {
    val expected = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz"
    val actual = fizzBuzz.getResult(-1, 10)
    Assert.assertEquals(expected, actual)
  }

  @Test def testGetResult_startZero() {
    val expected = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz"
    val actual = fizzBuzz.getResult(-1, 10)
    Assert.assertEquals(expected, actual)
  }

}
