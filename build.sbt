name := "scala-fizzbuzz"

version := "0.9.14"

// http://www.scala-lang.org/
scalaVersion := "2.11.4"

/* https://github.com/junit-team/junit */
/* https://github.com/szeiger/junit-interface */
libraryDependencies ++= Seq(
    "junit" % "junit" % "4.12-beta-3" % "test",
    "com.novocode" % "junit-interface" % "0.11" % "test"
)
