package views.usage.html

import views.Code

object	Example2
extends	Code
{
	val code: String =
		"""
		  |@input( type: Option[type], name: Option[String], value: Option[String], placeholder: Option[String], attributes: (String, String)* )
		  |@input( type: Option[type], name: Option[String], value: Option[String], attributes: (String, String)* )
		  |@input( type: Option[type], name: Option[String], attributes: (String, String)* )
		""".stripMargin

	val result = None

	val preview = None
}