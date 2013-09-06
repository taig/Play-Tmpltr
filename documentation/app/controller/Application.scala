package controller

import play.api.mvc._

object Application extends Controller
{
	def index = Action
	{
		Ok(
			view.html.index(
				name = "Play Tmpltr",
				repository = "https://github.com/Taig/Play-Tmpltr",
				source = "https://github.com/Taig/Play-Tmpltr/tree/master",
				documentation = "https://github.com/Taig/Play-Tmpltr/tree/master/documentation",
				scalaDoc = "http://taig.github.io/Play-Tmpltr/doc/#com.taig.tmpltr.package"
			)
		)
	}
}