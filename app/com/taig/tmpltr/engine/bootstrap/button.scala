package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._
import com.taig.tmpltr.engine.html

import play.api.templates.Html

object	button
extends	property.button
{
	class	a( attributes: Attributes )( content: Html )
	extends	markup.a[a]( attributes )( content )
	{
		def this( href: Option[String], target: Option[a.target], style: Option[a.style], size: Option[a.size], disabled: Boolean, attributes: Attributes )( content: Html ) =
		{
			this( attributes ++ Attributes(
					"href" -> href,
					"target" -> target,
					"class" -> Seq[Option[_]](
						"btn",
						style,
						size,
						if( disabled ) { Some( "disabled" ) } else { None } ) )
			)( content )
		}

		protected def copy = new a( _: Attributes )( content )
	}

	object	a
	extends	html.property.a
	with	property.button
	{
		def apply( href: Option[String] = None, target: Option[target] = None, style: style = a.style.default, size: size = a.size.default, disabled: Boolean = false, attributes: Attributes = Attributes.empty )( content: Html ): a =
		{
			new a( href, target, style, size, disabled, attributes )( content )
		}
	}

	class	input( attributes: Attributes )
	extends	markup.input[input]( attributes )
	{
		def this( `type`: Option[input.`type`], value: Option[String], name: Option[String], style: Option[input.style], size: Option[input.size], disabled: Boolean, attributes: Attributes ) =
		{
			this( attributes ++ Attributes(
				"type" -> `type`,
				"value" -> value,
				"name" -> name,
				"class" -> Seq[Option[_]]( "btn", style, size ) ) ++ {
				if( disabled ) { Attributes( "disabled" -> "disabled" ) } else { Attributes.empty } } )
		}

		protected def copy = new input( _: Attributes )
	}

	object	input
	extends	property.button
	{
		class `type`( `type`: String ) extends Property( `type` )
		object `type`
		{
			object button extends `type`( "button" )
			object reset extends `type`( "reset" )
			object submit extends `type`( "submit" )
		}

		def apply( `type`: Option[`type`] = None, value: Option[String] = None, name: Option[String] = None, style: style = input.style.default, size: size = input.size.default, disabled: Boolean = false, attributes: Attributes = Attributes.empty ): input =
		{
			new input( `type`, value, name, style, size, disabled, attributes )
		}

		object button
		{
			def apply( value: Option[String] = None, name: Option[String] = None, style: style = input.style.default, size: size = input.size.default, disabled: Boolean = false, attributes: Attributes = Attributes.empty ): input =
			{
				input( `type`.button, value, name, style, size, disabled, attributes )
			}
		}

		object reset
		{
			def apply( value: Option[String] = None, name: Option[String] = None, style: style = input.style.default, size: size = input.size.default, disabled: Boolean = false, attributes: Attributes = Attributes.empty ): input =
			{
				input( `type`.reset, value, name, style, size, disabled, attributes )
			}
		}

		object submit
		{
			def apply( value: Option[String] = None, name: Option[String] = None, style: style = input.style.default, size: size = input.size.default, disabled: Boolean = false, attributes: Attributes = Attributes.empty ): input =
			{
				input( `type`.submit, value, name, style, size, disabled, attributes )
			}
		}
	}
}