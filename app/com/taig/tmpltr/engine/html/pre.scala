package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	pre( attributes: Attributes )( content: Content )
extends	markup.pre[pre]( attributes )( content )
{
	protected def copy = new pre( _: Attributes )( content )
}

object pre
{
	def apply( attributes: Attributes )( content: Content ): pre = new pre( attributes )( content )

	def apply( content: Content ): pre = apply( Attributes.empty )( content )
}