package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	form( action: Option[String], method: Option[form.method], attributes: Attributes )( content: Content )
extends	markup.form[form]( attributes ~~ ( ( "action" -> action, "method" -> method ) ) )( content )
{
	protected def copy = new form( action, method, _: Attributes )( content )
}

object form extends property.form
{
	def apply( action: Option[String] = None, method: Option[method] = None, attributes: Attributes = Attributes.empty )( content: Content ): form =
	{
		new form( action, method, attributes )( content )
	}

	def apply( attributes: Attributes )( content: Content ): form = apply( None, None, attributes )( content )

	def apply( content: Content ): form = apply( Attributes.empty )( content )
}