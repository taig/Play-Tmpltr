package com.taig.tmpltr.engine.html

import com.taig.tmpltr._
import com.taig.tmpltr.engine.{ html => element }

import play.api.mvc.Content

class	boilerplate /*private*/( val attributes: Attributes, val content: Content )
extends	Tag.Body[boilerplate, Content]
{
	def this( attributes: Attributes, head: markup.head, body: markup.body ) =
	{
		this( attributes, new html( attributes, head += body ) )
	}

	val tag = null

	override def toString = doctype.toString + "\n" + content
}

object	boilerplate
{
	def apply( attributes: Attributes )( head: markup.head )( body: markup.body ): boilerplate =
	{
		new boilerplate( attributes, head, body )
	}

	def apply( head: markup.head )( body: markup.body ): boilerplate =
	{
		apply( Attributes.empty )( head )( body )
	}
}