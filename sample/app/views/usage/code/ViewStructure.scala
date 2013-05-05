package views.usage.code

import views.Code

object ViewStructure extends Code
{
	val code: String =
		"""
		  |@*************************
		  |* Your view's signature. *
		  |*************************@
		  |@( args: Any* )
		  |
		  |@*********************
		  |* Import statements. *
		  |*********************@
		  |@import com.taig.bootstrapper.Template._
		  |
		  |<p>Your HTML code.</p>
		""".stripMargin

	override val lang: String = "html"

	val preview = None
}