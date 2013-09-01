package view.usage.html

import views.Code

object	Example1
extends	Code
{
	val code: String =
		"""
		  |@div {
		  |    @h1 { No big surprises here. }
		  |    @p { If you know the common @em{ HTML } tags this will be easy for you. }
		  |}
		""".stripMargin

	val result: Option[String] =
		"""
		  |<div>
		  |    <h1>No big surprises here.</h1>
		  |    <p>If you know the common <em>HTML</em> tags this will be easy for you.</p>
		  |</div>
		""".stripMargin

	val preview = None
}