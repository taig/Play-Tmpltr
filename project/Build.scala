import sbt.Keys._
import play.Project

object Build extends sbt.Build
{
	val main = Project( "play-tmpltr" ).settings(
		organization := "com.taig",
		scalacOptions ++= Seq( "-feature", "-language:implicitConversions", "-language:existentials" ) )
}