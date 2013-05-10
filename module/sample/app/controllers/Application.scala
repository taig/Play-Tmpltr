package controllers

import play.api.mvc._

object Application extends Controller
{
	def index = Action
	{
		Ok(
			views.html.index(
				"Play Bootstrapper",
				"https://github.com/Taig/Play-Bootstrapper",
				"https://github.com/Taig/Play-Bootstrapper/blob/master/module/library",
				"https://github.com/Taig/Play-Bootstrapper/blob/master/module/sample",
				"http://taig.github.io/Play-Bootstrapper/doc"
			)
		)
	}
}