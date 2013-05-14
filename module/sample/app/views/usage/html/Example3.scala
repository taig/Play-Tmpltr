package views.usage.html

import views.Code

object	Example3
extends	Code
{
	val code: String =
		"""
		  |@input( input.`type`.text, "username", "taig", "Enter username ..."  )
		""".stripMargin

	val result: Option[String] =
		"""
		  |<input type="submit" name="username" value="taig" placeholder="Enter username ..." />
		""".stripMargin

	val preview = None
}