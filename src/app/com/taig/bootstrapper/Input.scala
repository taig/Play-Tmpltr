package com.taig.bootstrapper

import scala.xml.Elem

abstract class Input[I <: Input[I]](element: Elem, name: Option[String], attributes: Attributes) extends HtmlNode[I](
	element, name.fold( attributes )( name => attributes + ( "name" -> name ) )
)

object Input
{
	class Field(`type`: Field.Type, name: Option[String], attributes: Attributes) extends Input[Field](
			<input type={`type`}/>, name, attributes
	)
	{
		def %(attributes: Attributes) = new Field( `type`, name, this.attributes ++ attributes )
	}

	object Field
	{
		class Type(identifier: String) extends Property( None, identifier )
		object Type
		{
			case object Checkbox extends Type( "checkbox" )
			case object Password extends Type( "password" )
			case object Radio extends Type( "radio" )
			case object Text extends Type( "text" )
		}
	}

	class TextArea(name: Option[String], attributes: Attributes) extends Input[TextArea](
		<textarea></textarea>,
		name,
		attributes
	)
	{
		def %(attributes: Attributes) = new TextArea( name, this.attributes ++ attributes )
	}
}