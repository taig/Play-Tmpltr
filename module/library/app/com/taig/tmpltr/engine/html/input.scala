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
	def apply( `type`: Option[`type`], name: Option[String], value: Option[String], placeholder: Option[String], attributes: (String, String)* ): input =
	{
		new input( `type`, name, value, placeholder, attributes )
	}

	def apply( `type`: Option[`type`], name: Option[String], value: Option[String], attributes: (String, String)* ): input =
	{
		apply( `type`, name, value, None, attributes: _* )
	}

	def apply( `type`: Option[`type`], name: Option[String], attributes: (String, String)* ): input =
	{
		apply( `type`, name, None, attributes: _* )
	}

	def apply( attributes: (String, String)* ): input = apply( None, None, attributes: _* )

	object checkbox
	{
		def apply( name: Option[String], value: Option[String], checked: Boolean, attributes: (String, String)* ): input =
		{
			input( `type`.checkbox, name, value, ( attributes ++ Attributes( "checked" -> ( if( checked ) "checked" else None ) ) ): _* )
		}

		def apply( name: Option[String], value: Option[String], attributes: (String, String)* ): input =
		{
			apply( name, value, false, attributes: _* )
		}

		def apply( name: Option[String], attributes: (String, String)* ): input = apply( name, None, attributes: _* )

		def apply( attributes: (String, String)* ): input = apply( None, attributes: _* )
	}

	object file
	{
		def apply( name: Option[String], attributes: (String, String)* ): input =
		{
			input( `type`.file, name, None, attributes: _* )
		}

		def apply( attributes: (String, String)* ): input = apply( None, attributes: _* )
	}

	object hidden
	{
		def apply( name: Option[String], value: Option[String], attributes: (String, String)* ): input =
		{
			input( `type`.hidden, name, value, attributes: _* )
		}

		def apply( name: Option[String], attributes: (String, String)* ): input = apply( name, None, attributes: _* )

		def apply( attributes: (String, String)* ): input = apply( None, attributes: _* )
	}

	object password
	{
		def apply( name: Option[String], value: Option[String], placeholder: Option[String], attributes: (String, String)* ): input =
		{
			input( `type`.password, name, value, ( attributes ++ Attributes( "placeholder" -> placeholder ) ): _* )
		}

		def apply( name: Option[String], attributes: (String, String)* ): input = apply( name, None, None, attributes: _* )

		def apply( attributes: (String, String)* ): input = apply( None, attributes: _* )
	}

	object radio
	{
		def apply( name: Option[String], value: Option[String], checked: Boolean, attributes: (String, String)* ): input =
		{
			input( `type`.radio, name, value, (attributes ++ Attributes( "checked" -> ( if( checked ) "checked" else None ) ) ): _* )
		}

		def apply( name: Option[String], value: Option[String], attributes: (String, String)* ): input =
		{
			apply( name, value, false, attributes: _* )
		}

		def apply( name: Option[String], attributes: (String, String)* ): input = apply( name, None, attributes: _* )

		def apply( attributes: (String, String)* ): input = apply( None, attributes: _* )
	}

	object reset extends
	{
		def apply( value: Option[String], attributes: (String, String)* ): input =
		{
			input( `type`.reset, None, value, attributes: _* )
		}

		def apply( attributes: (String, String)* ): input = apply( None, attributes: _* )
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
		def apply( name: Option[String], attributes: (String, String)* )( content: Html ): select =
		{
			new select( name, attributes )( content )
		}

		def apply( attributes: (String, String)* )( content: Html ): select = apply( None, attributes: _* )( content )

		def apply( content: Html ): select = apply()( content )
	}

	object submit
	{
		def apply( value: Option[String], name: Option[String], attributes: (String, String)* ): input =
		{
			input( `type`.submit, name, value, attributes: _* )
		}

		def apply( value: Option[String], attributes: (String, String)* ): input = apply( value, None, attributes: _* )

		def apply( attributes: (String, String)* ): input = apply( None, attributes: _* )
	}

	object text
	{
		def apply( name: Option[String], value: Option[String], placeholder: Option[String], attributes: (String, String)* ): input =
		{
			input( `type`.text, name, value, ( attributes ++ Attributes( "placeholder" -> placeholder ) ): _* )
		}

		def apply( name: Option[String], attributes: (String, String)* ): input = apply( name, None, None, attributes: _* )

		def apply( attributes: (String, String)* ): input = apply( None, attributes: _* )
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
		def apply( name: Option[String], value: Option[String], attributes: (String, String)* ): textarea =
		{
			new textarea( name, attributes )( value.fold( Txt.empty )( Txt( _ ) ) )
		}

		def apply( name: Option[String], attributes: (String, String)* ): textarea = apply( name, None, attributes: _* )

		def apply( attributes: (String, String)* ): textarea = apply( None, attributes: _* )
	}
}