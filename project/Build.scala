import sbt._
import Keys._

import play.Project

object Build extends sbt.Build
{
	val version = "0.1"

	val main = Project( "play-tmpltr", version ).settings(
		organization := "com.taig",
//		sourceGenerators in Compile <+= ( dependencyClasspath in TemplatesCompilerProject in Runtime, packageBin in TemplatesCompilerProject in Compile, scalaSource in Compile, sourceManaged in Compile, streams ) map Task.ScalaTemplates,
		scalacOptions ++= Seq( "-feature", "-language:implicitConversions", "-language:existentials" ) )
}