package views.features.form.element.input.submit

import views.Code
import com.taig.bootstrapper.Template.Form.Element.Input

object Usage extends Code
{
	val code =
		"""
		  |@Input.Submit( "Send it now!" )
		""".stripMargin

	val preview: Option[String] = Input.Submit( "Send it now!" ) + ""
}