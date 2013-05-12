package com.taig.tmpltr.markup

import com.taig.tmpltr.{Property, Attributes, Tag}
import play.api.templates.Html

class form(attributes: Attributes)(content: Html) extends Tag.Html.Body.Form[form]( attributes )( content )
{
	protected def copy = new form( _: Attributes )( content )
}

object form
{
	def apply(action: Option[String], method: Option[Method], attributes: (String, String)*)(content: Html): form =
	{
		new form( attributes ++ Attributes( "action" -> action, "method" -> method ) )( content )
	}

	def apply(attributes: (String, String)*)(content: Html): form = apply( None, None, attributes: _* )( content )

	def apply(content: Html): form = apply( )( content )

	class Method(method: String) extends Property( method )
	object Method
	{
		object Get extends Method( "GET" )
		object Post extends Method( "Post" )
	}
}