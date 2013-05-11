package views.features.button

import views.Code
import com.taig.bootstrapper.bootstrap.Template
import Template._
import com.taig.bootstrapper.bootstrap.Template
import Template.Button.Size
import Template.Button.Style
import controllers.routes

object Usage extends Code
{
	val code =
		"""
		  |@Button( "Grey and simple", "#", Size.Default, Style.Default, "tag" )
		  |@Button( "Large colors", routes.Application.index(), Size.Large, Style.Danger )
		  |@Button( None, "http://www.google.com", style = Style.Primary, icon = "heart" )
		""".stripMargin

	val preview: Option[String] =
			Button( "Grey and simple", "#", Size.Default, Style.Default, "tag" ) + "\n" +
			Button( "Large colors", routes.Application.index(), Size.Large, Style.Danger ) + "\n" +
			Button( None, "http://www.google.com", style = Style.Primary, icon = "heart" )
}