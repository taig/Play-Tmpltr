package views.usage.html

import views.Code

object	Example6
extends	Code
{
	val code: String =
		"""
		  |@boilerplate {
		  |    @meta( charset = "utf-8" )
		  |    …
		  |} {
		  |    @h1{ Hello there! }
		  |    …
		  |}
		""".stripMargin

	val result: Option[String] =
		"""
		  |<!DOCTYPE html>
		  |<html>
		  |    <head>
		  |        <meta charset="utf-8" />
		  |        …
		  |    </head>
		  |    <body>
		  |        <h1>Hello there!</h1>
		  |        …
		  |    </body>
		  |</html>
		""".stripMargin

	val preview = None
}