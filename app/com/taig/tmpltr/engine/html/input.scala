package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content
import play.api.templates.Txt

class	input( `type`: Option[input.`type`], name: Option[String], value: Option[String], placeholder: Option[String], attributes: Attributes )
extends	markup.input[input]( attributes ~~ ( ( "type" -> `type`, "name" -> name, "value" -> value, "placeholder" -> placeholder ) ) )
{
	protected def copy = new input( `type`, name, value, placeholder, _: Attributes )
}

object input extends property.input
{
	def apply( `type`: Option[`type`] = None, name: Option[String] = None, value: Option[String] = None, placeholder: Option[String] = None, attributes: Attributes = Attributes.empty ): input =
	{
		new input( `type`, name, value, placeholder, attributes )
	}

	def apply( attributes: Attributes ): input = apply( None, None, None, None, attributes )

	class	checkbox( name: Option[String], value: Option[String], checked: Boolean, attributes: Attributes )
	extends	input( `type`.checkbox, name, value, None, attributes ~ ( "checked" -> ( if( checked ) "checked" else None ) ) )

	object checkbox
	{
		def apply( name: Option[String] = None, value: Option[String] = None, checked: Boolean = false, attributes: Attributes = Attributes.empty ): checkbox =
		{
			new checkbox( name, value, checked, attributes )
		}

		def apply( attributes: Attributes ): checkbox = apply( None, None, false, attributes )
	}

	class	file( name: Option[String], attributes: Attributes )
	extends	input( `type`.file, name, None, None, attributes )
	
	object file
	{
		def apply( name: Option[String] = None, attributes: Attributes = Attributes.empty ): file =
		{
			new file( name, attributes )
		}

		def apply( attributes: Attributes ): file = apply( None, attributes )
	}
	
	class	hidden( name: Option[String], value: Option[String], attributes: Attributes )
	extends	input( `type`.hidden, name, value, None, attributes )

	object hidden
	{
		def apply( name: Option[String] = None, value: Option[String] = None, attributes: Attributes = Attributes.empty ): hidden =
		{
			new hidden( name, value, attributes )
		}

		def apply( attributes: Attributes ): hidden = apply( None, None, attributes )
	}

	class	password( name: Option[String], value: Option[String], placeholder: Option[String], attributes: Attributes )
	extends	input( `type`.password, name, value, placeholder, attributes )

	object password
	{
		def apply( name: Option[String] = None, value: Option[String] = None, placeholder: Option[String] = None, attributes: Attributes = Attributes.empty ): password =
		{
			new password( name, value, placeholder, attributes )
		}

		def apply( attributes: Attributes ): password = apply( None, None, None, attributes )
	}

	class	radio( name: Option[String], value: Option[String], checked: Boolean, attributes: Attributes )
	extends	input( `type`.radio, name, value, None, attributes ~ ( "checked" -> ( if( checked ) "checked" else None ) ) )
	
	object radio
	{
		def apply( name: Option[String] = None, value: Option[String] = None, checked: Boolean = false, attributes: Attributes = Attributes.empty ): radio =
		{
			new radio( name, value, checked, attributes )
		}

		def apply( attributes: Attributes ): radio = apply( None, None, false, attributes )
	}

	class	reset( value: Option[String], attributes: Attributes )
	extends	input( `type`.reset, None, value, None, attributes )
	
	object reset extends
	{
		def apply( value: Option[String] = None, attributes: Attributes = Attributes.empty ): reset =
		{
			new reset( value, attributes )
		}

		def apply( attributes: Attributes ): reset = apply( None, attributes )
	}

	class	select( name: Option[String], attributes: Attributes )( content: Content )
	extends	markup.select[select]( attributes ~ ( "name" -> name ) )( content )
	{
		protected def copy = new select( name, _: Attributes )( content )
	}

	object select
	{
		def apply( name: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Content ): select =
		{
			new select( name, attributes )( content )
		}

		def apply( attributes: Attributes )( content: Content ): select = apply( None, attributes )( content )

		def apply( content: Content ): select = apply( Attributes.empty )( content )
	}

	class	submit( value: Option[String], name: Option[String], attributes: Attributes )
	extends	input( `type`.submit, name, value, None, attributes )
	
	object submit
	{
		def apply( value: Option[String] = None, name: Option[String] = None, attributes: Attributes = Attributes.empty ): submit =
		{
			new submit( value, name, attributes )
		}

		def apply( attributes: Attributes ): submit = apply( None, None, attributes )
	}

	class	text( name: Option[String], value: Option[String], placeholder: Option[String], attributes: Attributes )
	extends	input( `type`.text, name, value, placeholder, attributes )
	
	object text
	{
		def apply( name: Option[String] = None, value: Option[String] = None, placeholder: Option[String] = None, attributes: Attributes = Attributes.empty ): text =
		{
			new text( name, value, placeholder, attributes )
		}

		def apply( attributes: Attributes ): text = apply( None, None, None, attributes )
	}

	class	textarea( name: Option[String], attributes: Attributes )( content: Txt )
	extends	markup.textarea[textarea]( attributes ~ ( "name" -> name ) )( content )
	{
		protected def copy = new textarea( name, _: Attributes )( content )
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