package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	video( attributes: Attributes )( content: Html )
extends	markup.video[video]( attributes )( content )
{
	protected def copy = new video( _: Attributes )( content )
}

object video
{
	def apply( attributes: (String, String)* )( content: Html ): video = new video( attributes )( content )

	def apply( content: Html ): video = apply()( content )
}