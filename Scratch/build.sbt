import com.typesafe.sbt.packager.archetypes.ServerLoader
import com.typesafe.sbt.SbtNativePackager._
import NativePackagerKeys._

organization := "com.stumbleupon"

name := "scala-learning-scratch"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.4"

resolvers ++= Seq(
  "StumbleUpon mirror" at "http://maven.stumble.net:8081/nexus/content/groups/public",
  "StumbleUpon releases" at "http://maven.stumble.net:8081/nexus/content/repositories/releases",
  "StumbleUpon snapshots" at "http://maven.stumble.net:8081/nexus/content/repositories/snapshots"
)

libraryDependencies ++= Seq(
  "com.stumbleupon.services" %% "common-core" % "1.0.0-SNAPSHOT",
  "com.stumbleupon.services" %% "common-io-slick" % "1.0.0-SNAPSHOT",
  "com.stumbleupon" %% "vajra-test" % "2.0.0-SNAPSHOT" % "test",
  "com.googlecode.juniversalchardet" % "juniversalchardet" % "1.0.3",
  "org.apache.hadoop" % "hadoop-core" % "1.2.1",
  "org.apache.hbase" % "hbase" % "0.94.25"
)

packageArchetype.java_server

bashScriptConfigLocation := Some("${app_home}/../conf/jvmopts")

(testOptions in Test) += Tests.Argument(TestFrameworks.ScalaTest, "-u", "target/test-reports")
