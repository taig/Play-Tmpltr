package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	form( attributes: Attributes )( content: Html )
extends	markup.form[form]( attributes )( content )
{
	def this( action: Option[String], method: Option[form.method], attributes: Attributes )( content: Html ) =
	{
		this( attributes ++ Attributes( "action" -> action, "method" -> method ) )( content )
	}

	protected def copy = new form( _: Attributes )( content )
}

object form extends property.form
{
	def apply( action: Option[String], method: Option[method], attributes: (String, String)* )( content: Html ): form =
	{
		new form( action, method, attributes )( content )
	}

	def apply( attributes: (String, String)* )( content: Html ): form = apply( None, None, attributes: _* )( content )

	def apply( content: Html ): form = apply()( content )
}