import sbt._
import play.Project

object ApplicationBuild extends Build
{
	val version = "0.1 ALPHA"

	val library = Project( "play-tmpltr", version, path = file( "module" ) / "library" )

	val sample = Project( "sample", version, path = file( "module" ) / "sample" ).dependsOn( library )

	val main = Project( "tmpltr", version ).dependsOn( library, sample ).aggregate( library, sample )
}