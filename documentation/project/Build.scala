import sbt._
import sbt.Keys._
import play.Project._

object Build extends sbt.Build
{
	val tmpltr = ProjectRef( file( "../" ), "play-tmpltr" )

	val main = play.Project(
		"documentation",
		dependencies = Seq(
			"org.webjars" %% "webjars-play" % "2.2.1",
			"org.webjars" % "bootstrap" % "3.1.0",
			"org.webjars" % "highlightjs" % "8.0-3"
		)
	).settings(
		templatesImport ++= Seq(
			"com.taig.tmpltr._",
			"com.taig.tmpltr.engine.html._",
			"com.taig.tmpltr.engine.{ bootstrap => bs }",
			"widget._" ),
		scalacOptions ++= Seq( "-feature", "-language:implicitConversions" )
	).dependsOn( tmpltr ).aggregate( tmpltr )
}