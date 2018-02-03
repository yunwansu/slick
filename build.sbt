import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.4",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Hello",
    libraryDependencies ++= Seq(
	scalaTest % Test,
	"com.typesafe.slick" %% "slick" % "3.2.1",
	"org.slf4j" % "slf4j-nop" % "1.6.4",
	"com.typesafe.slick" %% "slick-hikaricp" % "3.2.1",
	"com.typesafe" % "config" % "1.3.1",
	"com.h2database" % "h2" % "1.4.196")
  )
