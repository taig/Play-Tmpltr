package views.installation

import views.Code

object Example2 extends Code
{
	val code: String =
		"""
		  |val main = play.Project( "project-name", "1.0 BETA" )
		  |               .settings( templatesImport ++= Seq(
		  |                   "com.taig.tmpltr._",
		  |                   "com.taig.tmpltr.markup._",
		  |                   "com.taig.tmpltr.bootstrap._"
		  |                   )
		  |               )
		""".stripMargin

	val preview = None
}