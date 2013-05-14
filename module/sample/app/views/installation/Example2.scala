package views.installation

import views.Code

object Example2 extends Code
{
	override val lang = "html"

	val code: String =
		"""
		  |@( args: Any* )
		  |
		  |@import com.taig.tmpltr._
		  |@import com.taig.tmpltr.engine.html._
		  |@import com.taig.tmpltr.engine.{ bootstrap => bs }
		  |
		  |@bs.lead{ Your prefixed @cite{ Twitter Bootstrap } goes here. }
		""".stripMargin

	val preview = None
}