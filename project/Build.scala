import sbt._
import Keys._

import play.Project

object Build extends sbt.Build
{
	val version = "0.1"

	val main = Project( "play-tmpltr", version ).settings(
		organization := "com.taig",
		scalacOptions ++= Seq( "-feature", "-language:implicitConversions" ) )
}