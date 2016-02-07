Scala FizzBuzz
==============

A version of the
[FizzBuzz](http://imranontech.com/2007/01/24/using-fizzbuzz-to-find-developers-who-grok-coding/)
program written in Scala.

[![Build Status](https://travis-ci.org/jbarker/scala-fizzbuzz.png?branch=master)](https://travis-ci.org/jbarker/scala-fizzbuzz)


Highlights
----------

* Simple usage available with `sbt`
* Full usage available with `object FizzBuzz`
* Handles certain malformed input without error
* Unit tested


Running
-------

In your favorite shell, set your working directory to the project root and
launch `sbt`:

    $ sbt

At the `sbt` prompt, run FizzBuzz with:

    > run

The output for `run` should be close to the following:

    [info] Running com.jbarker.code.scala.fizzbuzz.FizzBuzz
    1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz
    Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz 31 32 Fizz 34 Buzz Fizz 37 38 Fizz
    Buzz 41 Fizz 43 44 FizzBuzz 46 47 Fizz 49 Buzz Fizz 52 53 Fizz Buzz 56 Fizz 58
    59 FizzBuzz 61 62 Fizz 64 Buzz Fizz 67 68 Fizz Buzz 71 Fizz 73 74 FizzBuzz 76
    77 Fizz 79 Buzz Fizz 82 83 Fizz Buzz 86 Fizz 88 89 FizzBuzz 91 92 Fizz 94 Buzz
    Fizz 97 98 Fizz Buzz
    [success] Total time: 0 s, completed May 5, 2012 12:34:56 PM


Testing
-------

At the `sbt` prompt, test FizzBuzz with:

    > test

The output for `test` should be close to the following:

    [info] Passed: : Total 11, Failed 0, Errors 0, Passed 11, Skipped 0
    [success] Total time: 0 s, completed May 5, 2012 12:34:56 PM


Future
------

Possible changes and additions could include:

* Support console input for custom number ranges
* Update error handling to use exceptions
* Update unit tests to use ScalaTest


Development
-----------

Developed with:

* [Scala](http://www.scala-lang.org/) 2.11.7
* [sbt](http://www.scala-sbt.org/) 0.13.9
* [JUnit](http://junit.org/) 4.12


Release History
---------------

0.9.18 - 07 February 2016

* Upgraded dependencies.

0.9.2 &ndash; 0.9.17

* Upgraded dependencies.

0.9.1 - 13 May 2012

* Updated sbt due to scala-sbt.org replacing scala-tools.org.

0.9 - 05 May 2012

* Initial version.
