import sbt._
import sbt.Keys._
import play.Project._

object Build extends sbt.Build
{
	val tmpltr = ProjectRef( file( "../" ), "play-tmpltr" )

	val main = play.Project( "documentation" )
		.settings(
			libraryDependencies ++= Seq(
				"org.webjars" %% "webjars-play" % "2.2.1",
				"org.webjars" % "bootstrap" % "3.1.0",
				"org.webjars" % "highlightjs" % "8.0-3"
			),
			scalacOptions ++= Seq( "-feature", "-language:implicitConversions" ),
			templatesImport ++= Seq(
				"com.taig.tmpltr._",
				"com.taig.tmpltr.engine.html._",
				"widget._",
				"widget.{ bootstrap => bs }"
			)
		)
		.dependsOn( tmpltr )
		.aggregate( tmpltr )
}