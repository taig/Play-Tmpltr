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
		def this( href: Option[String], target: Option[a.target], style: Option[a.style], size: Option[a.size], attributes: Attributes )( content: Html ) =
		{
			this( attributes ++ Attributes( "href" -> href, "target" -> target, "class" -> "btn" ) )( content )
		}

		protected def copy = new a( _: Attributes )( content )
	}

	object	a
	extends	html.property.a
	with	property.button
	{
		def apply( href: Option[String], target: Option[target], style: style, size: size, attributes: (String, String)* )( content: Html ): a =
		{
			new a( href, target, style, size, attributes )( content )
		}

		def apply( href: Option[String], target: Option[target], style: style, attributes: (String, String)* )( content: Html ): a =
		{
			apply( href, target, style, size.default, attributes: _* )( content )
		}

		def apply( href: Option[String], target: Option[target], size: size, attributes: (String, String)* )( content: Html ): a =
		{
			apply( href, target, style.default, size, attributes: _* )( content )
		}

		def apply( href: Option[String], target: Option[target], attributes: (String, String)* )( content: Html ): a =
		{
			apply( href, target, style.default, size.default, attributes: _* )( content )
		}

		def apply( href: Option[String], style: style, size: size, attributes: (String, String)* )( content: Html ): a =
		{
			apply( href, None, style, size, attributes: _* )( content )
		}

		def apply( href: Option[String], style: style, attributes: (String, String)* )( content: Html ): a =
		{
			apply( href, None, style, size.default, attributes: _* )( content )
		}

		def apply( href: Option[String], size: size, attributes: (String, String)* )( content: Html ): a =
		{
			apply( href, None, style.default, size, attributes: _* )( content )
		}

		def apply( href: Option[String], attributes: (String, String)* )( content: Html ): a =
		{
			apply( href, None, style.default, size.default, attributes: _* )( content )
		}
	}

	class	input( attributes: Attributes )
	extends	markup.input[input]( attributes )
	{
		def this( value: Option[String], name: Option[String], style: Option[input.style], size: Option[input.size], attributes: Attributes )( content: Html ) =
		{
			this( attributes ++ Attributes( "value" -> value, "name" -> name, "class" -> "btn" ) )( content )
		}

		protected def copy = new input( _: Attributes )
	}

	object	input
	extends	html.property.input
	with	property.button
	{
		def apply( value: Option[String], name: Option[String], style: style, size: size, attributes: (String, String)* ): input =
		{
			new input( value, name, style, size, attributes )
		}

		def apply( value: Option[String], name: Option[String], style: style, attributes: (String, String)* ): input =
		{
			apply( value, name, style, size.default, attributes: _* )
		}

		def apply( value: Option[String], name: Option[String], size: size, attributes: (String, String)* ): input =
		{
			apply( value, name, style.default, size, attributes: _* )
		}

		def apply( value: Option[String], name: Option[String], attributes: (String, String)* ): input =
		{
			apply( value, name, style.default, size.default, attributes: _* )
		}

		def apply( value: Option[String], style: style, size: size, attributes: (String, String)* ): input =
		{
			apply( value, None, style, size, attributes: _* )
		}

		def apply( value: Option[String], style: style, attributes: (String, String)* ): input =
		{
			apply( value, None, style, size.default, attributes: _* )
		}

		def apply( value: Option[String], size: size, attributes: (String, String)* ): input =
		{
			apply( value, None, style.default, size, attributes: _* )
		}

		def apply( value: Option[String], attributes: (String, String)* ): input =
		{
			apply( value, None, style.default, size.default, attributes: _* )
		}
	}
}