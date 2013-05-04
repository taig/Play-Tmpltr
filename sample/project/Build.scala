import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build
{
	val appName = "sample"
	val appVersion = "1.0-SNAPSHOT"

	val appDependencies = Seq(
		"bootstrapper" % "bootstrapper_2.10" % "0.1"
	)

	val main = play.Project( appName, appVersion, appDependencies ).settings(
		resolvers += "Local Play Repository" at "/Users/Taig/Development/Scala/PlayFramework/repository/local"
	)
}