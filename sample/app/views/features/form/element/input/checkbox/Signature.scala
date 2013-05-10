package views.features.form.element.input.checkbox

import views.Code

object Signature extends Code
{
	val code =
		"""
		  |@Input.Checkbox( name: Option[String] = None, value: Option[String] = None, checked: Boolean = false, attributes: Attributes = Attributes.empty )
		""".stripMargin

	val preview = None
}