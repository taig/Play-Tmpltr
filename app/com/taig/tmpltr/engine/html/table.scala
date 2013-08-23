package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	table( attributes: Attributes )( content: Content )
extends	markup.table[table]( attributes )( content )
with	Helper.Default[table]
{
	protected val helper = table
}

object	table
extends	Helper.DefaultCompanion[table]
{
	def apply( attributes: Attributes )( content: Content ): table = new table( attributes )( content )
}