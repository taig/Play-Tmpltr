package com.taig.tmpltr.html

import com.taig.tmpltr._

class input(attributes: Attributes) extends Tag.Html.Body.Form.Input[input]( attributes )
{
	protected def copy = new input( _: Attributes )
}

object input
{
	def apply(`type`: Option[Type], name: Option[String], value: Option[String], attributes: (String, String)*): input =
	{
		new input( attributes ++ Attributes( "type" -> `type`, "name" -> name, "value" -> value ) )
	}

	def apply(`type`: Option[Type], name: Option[String], attributes: (String, String)*): input =
	{
		apply( `type`, name, None, attributes: _* )
	}

	def apply(attributes: (String, String)*): input = apply( None, None, attributes: _* )

	class Type(`type`: String) extends Property( `type` )
	object Type
	{
		object Button extends Type( "button" )
		object Checkbox extends Type( "checkbox" )
		object Color extends Type( "color" )
		object Date extends Type( "date" )
		object DateTime extends Type( "datetime" )
		object DateTimeLocal extends Type( "datetime-local" )
		object Email extends Type( "email" )
		object File extends Type( "file" )
		object Hidden extends Type( "hidden" )
		object Image extends Type( "image" )
		object Month extends Type( "month" )
		object Number extends Type( "number" )
		object Password extends Type( "password" )
		object Range extends Type( "range" )
		object Radio extends Type( "radio" )
		object Reset extends Type( "reset" )
		object Search extends Type( "search" )
		object Submit extends Type( "submit" )
		object Tel extends Type( "tel" )
		object Text extends Type( "text" )
		object Time extends Type( "time" )
		object Url extends Type( "url" )
		object Week extends Type( "week" )
	}

	object checkbox extends
	{
		def apply( name: Option[String], value: Option[String], checked: Boolean, attributes: (String, String)* ): input =
		{
			input( Type.Checkbox, name, value, (attributes ++ Attributes( "checked" -> ( if( checked ) "checked" else None ) ) ): _* )
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
			input( Type.File, name, None, attributes: _* )
		}

		def apply( attributes: (String, String)* ): input = apply( None, attributes: _* )
	}

	object hidden
	{
		def apply( name: Option[String], value: Option[String], attributes: (String, String)* ): input =
		{
			input( Type.Hidden, name, value, attributes: _* )
		}

		def apply( name: Option[String], attributes: (String, String)* ): input = apply( name, None, attributes: _* )

		def apply( attributes: (String, String)* ): input = apply( None, attributes: _* )
	}

	object password
	{
		def apply( name: Option[String], value: Option[String], placeholder: Option[String], attributes: (String, String)* ): input =
		{
			input( Type.Password, name, value, ( attributes ++ Attributes( "placeholder" -> placeholder ) ): _* )
		}

		def apply( name: Option[String], attributes: (String, String)* ): input = apply( name, None, None, attributes: _* )

		def apply( attributes: (String, String)* ): input = apply( None, attributes: _* )
	}

	object radio extends
	{
		def apply( name: Option[String], value: Option[String], checked: Boolean, attributes: (String, String)* ): input =
		{
			input( Type.Radio, name, value, (attributes ++ Attributes( "checked" -> ( if( checked ) "checked" else None ) ) ): _* )
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
			input( Type.Reset, None, value, attributes: _* )
		}

		def apply( attributes: (String, String)* ): input = apply( None, attributes: _* )
	}

	object submit extends
	{
		def apply( value: Option[String], name: Option[String], attributes: (String, String)* ): input =
		{
			input( Type.Submit, name, value, attributes: _* )
		}

		def apply( value: Option[String], attributes: (String, String)* ): input = apply( value, None, attributes: _* )

		def apply( attributes: (String, String)* ): input = apply( None, attributes: _* )
	}

	object text
	{
		def apply( name: Option[String], value: Option[String], placeholder: Option[String], attributes: (String, String)* ): input =
		{
			input( Type.Text, name, value, ( attributes ++ Attributes( "placeholder" -> placeholder ) ): _* )
		}

		def apply( name: Option[String], attributes: (String, String)* ): input = apply( name, None, None, attributes: _* )

		def apply( attributes: (String, String)* ): input = apply( None, attributes: _* )
	}
}