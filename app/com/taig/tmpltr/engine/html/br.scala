package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

class	br( attributes: Attributes )
extends markup.br[br]( attributes )
with	Helper.Empty[br]
{
	protected val helper = br
}

object	br
extends	Helper.EmptyCompanion[br]
{
	def apply( attributes: Attributes = Attributes.empty ): br = new br( attributes )
}