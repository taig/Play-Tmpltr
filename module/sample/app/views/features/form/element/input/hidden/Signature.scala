package views.features.form.element.input.hidden

import views.Code

object Signature extends Code
{
	val code =
		"""
		  |@Input.Hidden( name: Option[String] = None, value: Option[String] = None, attributes: Attributes = Attributes.empty )
		""".stripMargin

	val preview = None
}
