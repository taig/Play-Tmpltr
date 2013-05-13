package views.installation

import views.Code

object Example2 extends Code
{
	override val lang = "html"

	val code: String =
		"""
		  |@( args: Any* )
		  |
		  |@import com.taig.tmpltr.{markup => html, bootstrap => bs, _}
		  |
		  |@bs.lead{ Your prefixed @html.cite{ HTML } goes here. }
		""".stripMargin

	val preview = None
}