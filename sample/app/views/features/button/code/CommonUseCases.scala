package views.features.button.code

import views.Code
import com.taig.bootstrapper.Template._
import controllers.routes

object CommonUseCases extends Code
{
	val code: String =
		"""
		  |@Button.Add( "User", routes.Application.index() )
		  |...
		  |@Button.Save( "#" )
		""".stripMargin

	val preview: Option[String] =
			Button.Add( "User", routes.Application.index() ) + "\n" +
			Button.Cancel( "#" ) + "\n" +
			Button.Delete( routes.Application.index() ) + "\n" +
			Button.Edit( routes.Application.index() ) + "\n" +
			Button.Save( "#" )
}