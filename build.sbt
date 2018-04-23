name := """Project"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.2"

libraryDependencies += guice

// include the H2 dependency
libraryDependencies += "com.h2database" % "h2" % "1.4.192"

//load Dependencies
libraryDependencies ++= Seq(evolutions, jdbc)