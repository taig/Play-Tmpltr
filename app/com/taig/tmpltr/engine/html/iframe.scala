package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	iframe( src: Option[String], attributes: Attributes )( content: Content )
extends	markup.iframe[iframe]( attributes ~ ( "src" -> src ) )( content )
{
	protected def copy = new iframe( src, _: Attributes )( content )
}

object iframe
{
	def apply( src: Option[String], attributes: Attributes )( content: Content ): iframe =
	{
		new iframe( src, attributes )( content )
	}

	def apply( attributes: Attributes )( content: Content ): iframe = apply( None, attributes )( content )

	def apply( content: Content ): iframe = apply( Attributes.empty )( content )
}