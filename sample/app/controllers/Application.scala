package controllers

import play.api.mvc._

object Application extends Controller
{
	def index = Action
	{
		Ok( views.html.index( "Play Bootstrapper", "https://github.com/Taig/Play-Bootstrapper" ) )
	}
}