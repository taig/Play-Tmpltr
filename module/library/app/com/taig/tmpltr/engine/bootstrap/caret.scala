package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._
import com.taig.tmpltr.{ markup, Attributes }

import play.api.templates.Html

class	caret( attributes: Attributes )
extends	markup.b[caret]( attributes )( Html.empty )
{
	protected def copy = new caret( _: Attributes )
}

object caret
{
	def apply( attributes: Attributes = Attributes.empty ): caret =
	{
		new caret( attributes ++ ( "class" -> "caret" ) )
	}
}