package views.features.form.element.input.checkbox

import views.Code
import com.taig.bootstrapper.Template.Form.Element._

object Usage extends Code
{
	val code =
		"""
		  |@Input.Checkbox( "checkbox", "value", true )
		  |@Input.Checkbox( "checkbox", "value" )
		""".stripMargin

	val preview: Option[String] =
		Input.Checkbox( "checkbox", "value", true ) + "\n" +
		Input.Checkbox( "checkbox", "value" )
}