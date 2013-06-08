organization := "tv.cntt"

name := "xitrum-scalatags"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.2"

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-unchecked"
)

// Most Scala projects are published to Sonatype, but Sonatype is not default
// and it takes several hours to sync from Sonatype to Maven Central
resolvers += "SonatypeReleases" at "http://oss.sonatype.org/content/repositories/releases/"

libraryDependencies += "tv.cntt" %% "xitrum" % "2.6" % "provided"

libraryDependencies += "com.scalatags" %% "scalatags" % "0.1.1"
