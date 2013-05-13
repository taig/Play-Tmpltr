package views.installation

import views.Code

object Example4 extends Code
{
	val code: String =
		"""
		  |val main = play.Project( "project-name", "1.0 BETA" )
		  |               .settings( templatesImport ++= Seq(
		  |                    "com.taig.tmpltr.{ markup => html, bootstrap => bs, _ }" )
		  |                )
		""".stripMargin

	val preview = None
}