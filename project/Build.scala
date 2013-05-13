import sbt._
import play.Project._

object ApplicationBuild extends Build
{
	val version = "0.1 ALPHA"

	val library = play.Project( "play-tmpltr", version, path = file( "module" ) / "library" )

	val sample = play.Project( "sample", version, path = file( "module" ) / "sample" )
			.settings( templatesImport ++= Seq(
				"com.taig.tmpltr._", "com.taig.tmpltr.{ markup => html }", "com.taig.tmpltr.{ bootstrap => bs }" )
			).dependsOn( library )

	val main = play.Project( "tmpltr", version ).dependsOn( library, sample ).aggregate( library, sample )
}