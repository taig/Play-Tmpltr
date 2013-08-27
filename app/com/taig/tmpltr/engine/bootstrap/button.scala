package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._
import com.taig.tmpltr.engine.html

import play.api.mvc.Content

class	button private( attributes: Attributes )( content: Content )
extends	html.button( attributes )( content )
with	Tag.Body[button, Content]
{
	def this( `type`: Option[button.`type`], style: button.style, size: Option[button.size], disabled: Boolean, attributes: Attributes )( content: Content ) =
	{
		this( attributes ~~ ( ( "type" -> `type`, "class" -> ( "btn", style, size ), "disabled" -> ( if( disabled ) Some( "disabled" ) else None ) ) ) )( content )
	}
}

object	button
extends	property.button
{
	def apply( `type`: Option[button.`type`] = None, style: button.style = button.style.default, size: Option[button.size] = None, disabled: Boolean = false, attributes: Attributes = Attributes.empty )( content: Content ) =
	{
		new button( `type`, style, size, disabled, attributes )( content )
	}

	class	a private( attributes: Attributes )( content: Content )
	extends	html.a( attributes )( content )
	with	Tag.Body[a, Content]
	{
		def this( href: Option[String], target: Option[a.target], style: style, size: Option[size], disabled: Boolean, attributes: Attributes )( content: Content ) =
		{
			this( attributes ~~ ( ( "href" -> href, "target" -> target, "class" -> ( "btn", style, size, if( disabled ) "disabled" else None ) ) ) )( content )
		}
	}

	object	a
	extends	html.property.a
	{
		def apply( href: Option[String] = None, target: Option[a.target] = None, style: style = button.style.default, size: Option[size] = None, disabled: Boolean = false, attributes: Attributes = Attributes.empty )( content: Content ) =
		{
			new a( href, target, style, size, disabled, attributes )( content )
		}
	}
	
	class	input private( attributes: Attributes )
	extends	html.input( attributes )
	with	Tag.Empty[input]
	{
		def this( `type`: Option[`type`], value: Option[String], style: style, size: Option[size], disabled: Boolean, attributes: Attributes ) =
		{
			this( attributes ~~ ( ( "type" -> `type`, "value" -> value, "class" -> ( "btn", style, size ) ) ) ~~ ( if( disabled ) "disabled" -> "disabled" else Attributes.empty ) )
		}
	}

	object input
	{
		def apply( `type`: Option[`type`] = None, value: Option[String] = None, style: style = button.style.danger, size: Option[size] = None, disabled: Boolean = false, attributes: Attributes ) =
		{
			new input( `type`, value, style, size, disabled, attributes )
		}
	}

	class	close( attributes: Attributes )
	extends	html.button( attributes ~~ ( ( "class" -> "close", "aria-hidden" -> "true" ) ) )( "&times;" )
	with	Tag.Empty[close]

	object	close
	extends	close( Attributes.empty )
	with	Tag.Empty.Appliable[close]
}