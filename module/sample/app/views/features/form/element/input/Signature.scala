package views.features.form.element.input

import views.Code

object Signature extends Code
{
	val code =
		"""
		  |@Input( type: Input.Type, name: Option[String] = None, attributes: Attributes = Attributes.empty )
		""".stripMargin

	val preview = None
}