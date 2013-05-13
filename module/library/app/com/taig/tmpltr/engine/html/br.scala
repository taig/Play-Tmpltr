package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

class	br( attributes: Attributes )
extends markup.br[br]( attributes )
{
	protected def copy = new br( _: Attributes )
}

object br
{
	def apply( attributes: (String, String)* ): br = new br( attributes )
}