package view.usage.html

import views.Code

object	Example4
extends	Code
{
	val code: String =
		"""
		  |@input.text( "username", "taig", "Enter username ..."  )
		""".stripMargin

	val result = None

	val preview = None
}