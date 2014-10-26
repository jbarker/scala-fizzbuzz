name := "scala-fizzbuzz"

version := "0.9.13"

// http://www.scala-lang.org/
scalaVersion := "2.11.3"

/* https://github.com/junit-team/junit */
/* https://github.com/szeiger/junit-interface */
libraryDependencies ++= Seq(
    "junit" % "junit" % "4.11" % "test",
    "com.novocode" % "junit-interface" % "0.11" % "test"
)
