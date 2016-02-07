name := "scala-fizzbuzz"

version := "0.9.18"

// http://www.scala-lang.org/
scalaVersion := "2.11.7"

/* https://github.com/junit-team/junit */
/* https://github.com/sbt/junit-interface */
libraryDependencies ++= Seq(
    "junit" % "junit" % "4.12" % "test",
    "com.novocode" % "junit-interface" % "0.11" % "test"
)
