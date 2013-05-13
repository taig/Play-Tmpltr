package controllers

import play.api.mvc._

object Application extends Controller
{
	def index = Action
	{
		Ok(
			views.html.index(
				"Play Tmpltr",
				"https://github.com/Taig/Play-Tmpltr",
				"https://github.com/Taig/Play-Tmpltr/blob/master/module/library",
				"https://github.com/Taig/Play-Tmpltr/blob/master/module/sample",
				"http://taig.github.io/Play-Tmpltr/doc/#com.taig.tmpltr.package"
			)
		)
	}
}