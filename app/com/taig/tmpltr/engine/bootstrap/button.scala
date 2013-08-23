package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._
import com.taig.tmpltr.Attributes
import com.taig.tmpltr.engine.html

import play.api.mvc.Content
import play.api.templates.Txt

object	button
extends	property.button
{	
	class	a( href: Option[String], target: Option[a.target], style: Option[a.style], size: Option[a.size], disabled: Boolean, attributes: Attributes )( content: Content )
	extends	markup.a[a]( attributes ~~ ( ( "href" -> href, "target" -> target, "class" -> ( "btn", style, size, if( disabled ) "disabled" else None ) ) ) )( content )
	{
		protected def copy = new a( href, target, style, size, disabled, _: Attributes )( content )
	}

	object	a
	extends	html.property.a
	with	property.button
	{
		def apply( href: Option[String] = None, target: Option[target] = None, style: style = a.style.default, size: size = a.size.default, disabled: Boolean = false, attributes: Attributes = Attributes.empty )( content: Content ) =
		{
			new a( href, target, style, size, disabled, attributes )( content )
		}
	}
	
	class	button( `type`: Option[button.`type`], style: Option[button.style], size: Option[button.size], disabled: Boolean, attributes: Attributes )( content: Content )
	extends	markup.button[button]( attributes ~~ ( ( "type" -> `type`, "class" -> ( "btn", style, size ), "disabled" -> ( if( disabled ) Some( "disabled" ) else None ) ) ) )( content )
	{
		protected def copy = new button( `type`, style, size, disabled, _: Attributes )( content )
	}
	
	object	button
	extends	property.button
	{
		def apply( `type`: Option[`type`] = None, style: style = button.style.default, size: size = button.size.default, disabled: Boolean = false, attributes: Attributes = Attributes.empty )( content: Content ) =
		{
			new button( `type`, style, size, disabled, attributes )( content )
		}

		object reset
		{
			def apply( style: style = button.style.default, size: size = button.size.default, disabled: Boolean = false, attributes: Attributes = Attributes.empty )( content: Content ) =
			{
				button( `type`.reset, style, size, disabled, attributes )( content )
			}
		}

		object submit
		{
			def apply( style: style = button.style.default, size: size = button.size.default, disabled: Boolean = false, attributes: Attributes = Attributes.empty )( content: Content ) =
			{
				button( `type`.submit, style, size, disabled, attributes )( content )
			}
		}
	}

	class	input( `type`: Option[input.`type`], value: Option[String], style: Option[input.style], size: Option[input.size], disabled: Boolean, attributes: Attributes )
	extends	markup.input[input]( attributes ~~ ( "type" -> `type`, "value" -> value, "class" -> ( "btn", style, size ) ) ~~ ( if( disabled ) "disabled" -> "disabled" else Attributes.empty ) )
	{
		protected def copy = new input( `type`, value, style, size, disabled, _: Attributes )
	}

	object	input
	extends	property.button
	{
		def apply( `type`: Option[`type`] = None, value: Option[String] = None, style: style = input.style.default, size: size = input.size.default, disabled: Boolean = false, attributes: Attributes = Attributes.empty ) =
		{
			new input( `type`, value, style, size, disabled, attributes )
		}

		object button
		{
			def apply( value: Option[String] = None, style: style = input.style.default, size: size = input.size.default, disabled: Boolean = false, attributes: Attributes = Attributes.empty ) =
			{
				input( `type`.button, value, style, size, disabled, attributes )
			}
		}

		object reset
		{
			def apply( value: Option[String] = None, style: style = input.style.default, size: size = input.size.default, disabled: Boolean = false, attributes: Attributes = Attributes.empty ) =
			{
				input( `type`.reset, value, style, size, disabled, attributes )
			}
		}

		object submit
		{
			def apply( value: Option[String] = None, style: style = input.style.default, size: size = input.size.default, disabled: Boolean = false, attributes: Attributes = Attributes.empty ) =
			{
				input( `type`.submit, value, style, size, disabled, attributes )
			}
		}
	}

	class	close( attributes: Attributes )
	extends	markup.button[close]( attributes ~~ ( "class" -> "close", "aria-hidden" -> "true" ) )( Txt( "&times;" ) )
	with	Helper.Empty[close]
	{
		protected val helper = close
	}

	object	close
	extends	Helper.EmptyCompanion[close]
	{
		def apply( attributes: Attributes = Attributes.empty ) = new close( attributes )
	}
}