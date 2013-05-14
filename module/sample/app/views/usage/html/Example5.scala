package views.usage.html

import views.Code

object	Example5
extends	Code
{
	val code: String =
		"""
		  |@canvas( "id" -> "whiteboard", "class" -> "grey large" ) {
		  |    @p{ No canvas, no fun. }
		  |}
		""".stripMargin

	val result: Option[String] =
		"""
		  |<canvas id="whiteboard" class="grey large">
		  |    <p>No canvas, no fun.</p>
		  |</canvas>
		""".stripMargin

	val preview = None
}