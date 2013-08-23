package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._

import play.api.templates.Html

class	caret( attributes: Attributes )
extends	markup.b[caret]( attributes ~ ( "class" -> "caret" ) )( Html.empty )
with	Helper.Empty[caret]
{
	protected val helper = caret
}

object	caret
extends	Helper.EmptyCompanion[caret]
{
	def apply( attributes: Attributes = Attributes.empty ): caret =
	{
		new caret( attributes )
	}
}