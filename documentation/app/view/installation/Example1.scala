package view.installation

import views.Code

object Example1 extends Code
{
	override val language = "xml"

	val code: String =
		"""
		  |@*************************
		  |* Your view's signature. *
		  |*************************@
		  |@( args: Any* )
		  |
		  |@***********************
		  |* Play Tmpltr imports. *
		  |***********************@
		  |@import com.taig.tmpltr._
		  |@import com.taig.tmpltr.engine.html._
		  |
		  |@p{ Your @cite{ HTML5 } goes here. }
		""".stripMargin

	val result = None

	val preview = None
}