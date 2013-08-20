package com.taig.tmpltr.engine.html

import com.taig.tmpltr._
import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes
import play.api.templates.{Html, Txt}

class	input( attributes: Attributes )
extends	markup.input[input]( attributes )
{
	def this( `type`: Option[input.`type`], name: Option[String], value: Option[String], placeholder: Option[String], attributes: Attributes ) =
	{
		this( attributes ++ Attributes( "type" -> `type`, "name" -> name, "value" -> value, "placeholder" -> placeholder ) )
	}

	protected def copy = new input( _: Attributes )
}

object input extends property.input
{
	def apply( `type`: Option[`type`] = None, name: Option[String] = None, value: Option[String] = None, placeholder: Option[String] = None, attributes: Attributes = Attributes.empty ): input =
	{
		new input( `type`, name, value, placeholder, attributes )
	}

	def apply( attributes: Attributes ): input = apply( None, None, None, None, attributes )

	object checkbox
	{
		def apply( name: Option[String] = None, value: Option[String] = None, checked: Boolean = false, attributes: Attributes = Attributes.empty ): input =
		{
			input( `type`.checkbox, name, value, None, attributes ++ Attributes( "checked" -> ( if( checked ) "checked" else None ) ) )
		}

		def apply( attributes: Attributes ): input = apply( None, None, false, attributes )
	}

	object file
	{
		def apply( name: Option[String] = None, attributes: Attributes = Attributes.empty ): input =
		{
			input( `type`.file, name, None, None, attributes )
		}

		def apply( attributes: Attributes ): input = apply( None, attributes )
	}

	object hidden
	{
		def apply( name: Option[String] = None, value: Option[String] = None, attributes: Attributes = Attributes.empty ): input =
		{
			input( `type`.hidden, name, value, None, attributes )
		}

		def apply( attributes: Attributes ): input = apply( None, None, attributes )
	}

	object password
	{
		def apply( name: Option[String] = None, value: Option[String] = None, placeholder: Option[String] = None, attributes: Attributes = Attributes.empty ): input =
		{
			input( `type`.password, name, value, placeholder, attributes ++ Attributes( "placeholder" -> placeholder ) )
		}

		def apply( attributes: Attributes ): input = apply( None, None, None, attributes )
	}

	object radio
	{
		def apply( name: Option[String] = None, value: Option[String] = None, checked: Boolean = false, attributes: Attributes = Attributes.empty ): input =
		{
			input( `type`.radio, name, value, None, attributes ++ Attributes( "checked" -> ( if( checked ) "checked" else None ) ) )
		}

		def apply( attributes: Attributes ): input = apply( None, None, false, attributes )
	}

	object reset extends
	{
		def apply( value: Option[String] = None, attributes: Attributes = Attributes.empty ): input =
		{
			input( `type`.reset, None, value, None, attributes )
		}

		def apply( attributes: Attributes ): input = apply( None, attributes )
	}

	class	select( attributes: Attributes )( content: Html )
			extends	markup.select[select]( attributes )( content )
	{
		def this( name: Option[String], attributes: Attributes )( content: Html ) =
		{
			this( attributes ++ Attributes( "name" -> name ) )( content )
		}

		protected def copy = new select( _: Attributes )( content )
	}

	object select
	{
		def apply( name: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Html ): select =
		{
			new select( name, attributes )( content )
		}

		def apply( attributes: Attributes )( content: Html ): select = apply( None, attributes )( content )

		def apply( content: Html ): select = apply( Attributes.empty )( content )
	}

	object submit
	{
		def apply( value: Option[String] = None, name: Option[String] = None, attributes: Attributes = Attributes.empty ): input =
		{
			input( `type`.submit, name, value, None, attributes )
		}

		def apply( attributes: Attributes ): input = apply( None, None, attributes )
	}

	object text
	{
		def apply( name: Option[String] = None, value: Option[String] = None, placeholder: Option[String] = None, attributes: Attributes = Attributes.empty ): input =
		{
			input( `type`.text, name, value, placeholder, attributes ++ Attributes( "placeholder" -> placeholder ) )
		}

		def apply( attributes: Attributes ): input = apply( None, None, None, attributes )
	}

	class	textarea( attributes: Attributes )( content: Txt )
			extends	markup.textarea[textarea]( attributes )( content )
	{
		def this( name: Option[String], attributes: Attributes )( content: Txt )
		{
			this( attributes ++ Attributes( "name" -> name ) )( content )
		}

		protected def copy = new textarea( _: Attributes )( content )
	}

	object textarea
	{
		def apply( name: Option[String] = None, value: Option[String] = None, attributes: Attributes = Attributes.empty ): textarea =
		{
			new textarea( name, attributes )( value.fold( Txt.empty )( Txt( _ ) ) )
		}

		def apply( attributes: Attributes ): textarea = apply( None, None, attributes )
	}
}