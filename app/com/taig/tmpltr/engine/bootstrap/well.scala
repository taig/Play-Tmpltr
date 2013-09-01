package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._
import com.taig.tmpltr.engine.html

import play.api.mvc.Content

class	well( attributes: Attributes, content: Content )
extends html.div( attributes ~ ( "class" -> "well" ), content )
with	Tag.Body[well, Content]
{
	def this( size: Option[well.size], attributes: Attributes, content: Content ) =
	{
		this( attributes ~ ( "class" -> size ), content )
	}
}

object	well
extends	Tag.Body.Appliable[well, Content]
with	property.well
{
	def apply( size: Option[size] = None, attributes: Attributes = Attributes.empty )( content: Content ) =
	{
		new well( size, attributes, content )
	}
}