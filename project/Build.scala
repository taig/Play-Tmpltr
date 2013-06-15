import sbt._
import Keys._

import play.Project
import play.Project._

object	ApplicationBuild
extends	Build
{
	val version = "0.1"

	val dependencies = Seq(
		"org.webjars" % "webjars-play" % "2.1.0-1",
		"org.webjars" % "bootstrap" % "2.3.1-1"
	)

	val library = Project( "tmpltr", version, path = file( "module" ) / "library" )
					.settings(
						organization := "com.taig.play",
						scalacOptions ++= Seq( "-feature", "-language:implicitConversions" )
					)

	val sample = Project( "sample", version, dependencies, file( "module" ) / "sample" )
					.settings( templatesImport ++= Seq(
						"com.taig.play.tmpltr._",
						"com.taig.play.tmpltr.engine.html._",
						"com.taig.play.tmpltr.engine.{ bootstrap => bs }"
						)
					)
					.dependsOn( library )

	val main = Project( "play-tmpltr", version )
					.dependsOn( library, sample )
					.aggregate( library, sample )
}
