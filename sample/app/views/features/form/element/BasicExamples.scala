package views.features.form.element

import views.Code
import com.taig.bootstrapper.Template.Form.Element._

object BasicExamples extends Code
{
	val code =
		"""
		  |@import com.taig.bootstrapper.Template._
		  |@import com.taig.bootstrapper.Template.Form.Element._
		  |
		  |@Input.Text( "textfield", value = "See how I shine" )
		  |@Input.Text( "textfield", placeholder = "Stuff will be written" )
		  |@Input.Text( "textfield", "See how I shine", "Stuff will be written" )
		""".stripMargin

	val preview: Option[String] =
		Input.Text( "textfield", value = "See how I shine" ) + "<br />" +
		Input.Text( "textfield", placeholder = "Stuff will be written" ) + "<br />" +
		Input.Text( "textfield", "See how I shine", "Stuff will be written" )
}