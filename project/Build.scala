import sbt.Keys._
import play.Project

object Build extends sbt.Build
{
	val main = Project( "play-tmpltr", settings = play.Project.playScalaSettings ).settings(
		name := "Play Tmpltr",
		organization := "com.taig",
		scalacOptions ++= Seq( "-feature", "-language:implicitConversions", "-language:existentials" ),
		version := "1.0.0-BETA"
	)
}