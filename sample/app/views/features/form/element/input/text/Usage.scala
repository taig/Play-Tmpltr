package views.features.form.element.input.text

import views.Code
import com.taig.bootstrapper.Attributes
import com.taig.bootstrapper.Template.Form.Element._

object Usage extends Code
{
	val code =
		"""
		  |@import com.taig.bootstrapper.Template._
		  |@import com.taig.bootstrapper.Template.Form.Element._
		  |
		  |@Input.Text( "textfield", value = "See how I shine" )
		  |@Input.Text( "textfield", placeholder = "Stuff will be written" )
		  |@Input( Input.Type.Text, "textfield", Attributes( "value" -> "See how I shine", "placeholder" -> "Stuff will be written" ) )
		""".stripMargin

	val preview: Option[String] =
		Input.Text( "textfield", value = "See how I shine" ) + "<br />" +
		Input.Text( "textfield", placeholder = "Stuff will be written" ) + "<br />" +
		Input( Input.Type.Text, "textfield", Attributes( "value" -> "See how I shine", "placeholder" -> "Stuff will be written" ) )
}