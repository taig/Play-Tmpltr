package views.features.button.code

import views.Code
import com.taig.bootstrapper.Template.Button
import controllers.routes

object CommonUseCases extends Code
{
	val code: String =
		"""
		  |@Button.Add( "User", routes.Application.index() )
		  |...
		  |@Button.Save( routes.Application.index() )
		""".stripMargin

	val preview: Option[String] =
			Button.Add( "User", routes.Application.index() ) + "\n" +
			Button.Cancel( routes.Application.index() ) + "\n" +
			Button.Delete( routes.Application.index() ) + "\n" +
			Button.Edit( routes.Application.index() ) + "\n" +
			Button.Save( routes.Application.index() )
}