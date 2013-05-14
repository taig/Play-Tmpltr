package views.installation

import views.Code

object Example3 extends Code
{
	val code: String =
		"""
		  |val main = play.Project( "project-name", "1.0 BETA" )
		  |               .settings( templatesImport ++= Seq(
		  |                   "com.taig.tmpltr._",
		  |                   "com.taig.tmpltr.engine.html._",
		  |                   "com.taig.tmpltr.engine.{ bootstrap => bs }"
		  |                   )
		  |               )
		""".stripMargin

	val preview = None
}