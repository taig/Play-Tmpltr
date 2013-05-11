package views.features.form.element.input.submit

import views.Code

object Signature extends Code
{
	val code =
		"""
		  |@Input.Submit( value: Option[String] = None, name: Option[String] = None, attributes: Attributes = Attributes.empty )
		""".stripMargin

	val preview = None
}