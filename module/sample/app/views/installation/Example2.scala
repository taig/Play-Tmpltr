package views.installation

import views.Code

object Example2 extends Code
{
	val code: String =
		"""
		  |val main = play.Project( "name", "1.0" )
		  |               .settings( templatesImport ++= Seq(
		  |                   "com.taig.tmpltr._",
		  |                   "com.taig.tmpltr.markup._",
		  |                   "com.taig.tmpltr.bootstrap._"
		  |                   )
		  |               )
		""".stripMargin

	val preview = None
}