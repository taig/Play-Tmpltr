package views.installation

import views.Code

object Example1 extends Code
{
	override val lang = "html"

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
		  |@p{ Your @cite{ HTML } goes here. }
		""".stripMargin

	val preview = None
}