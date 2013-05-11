package views.features.form.element.input.submit

import views.Code

object Example extends Code
{
	val code =
		"""
		  |@Input.Submit( value = "Send!" )
		""".stripMargin

	val preview: Option[String] = None
}