package views.features.form.element.input.text

import views.Code

object Signature extends Code
{
	val code =
		"""
		  |@Input.Text( name: Option[String] = None, value: Option[String] = None, placeholder: Option[String] = None, attributes: Attributes = Attributes.empty )
		""".stripMargin

	val preview = None
}
