package views.features.form.element.input.text

import views.Code
import com.taig.bootstrapper.Attributes
import com.taig.bootstrapper.Template.Form.Element._

object Usage extends Code
{
	val code =
		"""
		  |@Input.Text( "textfield", "See how I shine", "Stuff will be written" )
		  |@Input.Text( "textfield", placeholder = "Stuff will be written" )
		""".stripMargin

	val preview: Option[String] =
		Input.Text( "textfield", "See how I shine", "Stuff will be written" ) + "\n" +
		Input.Text( "textfield", placeholder = "Stuff will be written" )
}