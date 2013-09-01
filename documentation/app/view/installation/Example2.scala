package view.installation

import views.Code

object Example2 extends Code
{
	override val language = "xml"

	val code: String =
		s"""
		  |@( args: Any* )
		  |
		  |@import com.taig.tmpltr._
		  |@import com.taig.tmpltr.engine.html._
		  |@import com.taig.tmpltr.engine.{ bootstrap => bs }
		  |
		  |@bs.lead{ Your prefixed @cite{ Twitter Bootstrap } goes here. }
		""".stripMargin

	val result = None

	val preview = None
}