package com.taig.tmpltr.markup

import com.taig.tmpltr.{Property, Attributes, Tag}
import play.api.templates.Html

class button(attributes: Attributes)(content: Html) extends Tag.Html.Body.Form.Button[button]( attributes )( content )
{
	protected def copy = new button( _: Attributes )( content )
}

object button
{
	def apply(`type`: Option[Type], name: Option[String], attributes: (String, String)*)(content: Html): button =
	{
		new button( attributes ++ Attributes( "type" -> `type`, "name" -> name ) )( content )
	}

	def apply(`type`: Option[Type], attributes: (String, String)*)(content: Html): button =
	{
		apply( `type`, None, attributes: _* )( content )
	}

	def apply(attributes: (String, String)*)(content: Html): button = apply( None, attributes: _* )( content )

	def apply(content: Html): button = apply( )( content )

	class Type(`type`: String) extends Property( `type` )
	object Type
	{
		object Button extends Type( "button" )
		object Reset extends Type( "reset" )
		object Submit extends Type( "submit" )
	}
}