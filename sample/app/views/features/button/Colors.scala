package views.features.button

import views.Code
import com.taig.bootstrapper.Template._

object Colors extends Code
{
	val code: String =
		"""
		  |@Button( None, "#", style = Style.Default, icon = "heart" )
		  |@Button( None, "#", style = Style.Primary, icon = "heart" )
		""".stripMargin

	val preview: Option[String] =
		Button( None, "#", style = Button.Style.Default, icon = "heart" ) + "\n" +
		Button( None, "#", style = Button.Style.Primary, icon = "heart" ) + "\n"
}