import sbt._
import play.Project
import play.Project._

object	ApplicationBuild
extends	Build
{
	val version = "0.1 ALPHA"

	val dependencies = Seq(
		"org.webjars" % "webjars-play" % "2.1.0-1",
		"org.webjars" % "bootstrap" % "2.3.1-1"
	)

	val library = Project( "play-tmpltr", version, path = file( "module" ) / "library" )

	val sample = Project( "sample", version, dependencies, file( "module" ) / "sample" )
					.settings( templatesImport ++= Seq(
						"com.taig.tmpltr._",
						"com.taig.tmpltr.engine.html._",
						"com.taig.tmpltr.engine.{ bootstrap => bs }"
						)
					)
					.dependsOn( library )

	val main = Project( "tmpltr", version ).dependsOn( library, sample ).aggregate( library, sample )
}