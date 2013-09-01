package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	form( val attributes: Attributes, val content: Content )
extends	markup.form
with	Tag.Body[form, Content]
{
	def this( action: Option[String], method: Option[form.method], attributes: Attributes, content: Content ) =
	{
		this( attributes ~~ ( ( "action" -> action, "method" -> method ) ), content )
	}
}

object	form
extends	Tag.Body.Appliable[form, Content]
with	property.form
{
	def apply( action: Option[String] = None, method: Option[method] = None, attributes: Attributes = Attributes.empty )( content: Content ) =
	{
		new form( action, method, attributes, content )
	}
}