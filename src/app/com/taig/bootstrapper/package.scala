package com.taig

import play.api.templates.Html
import scala.xml.{NodeSeq, Text}

package object bootstrapper
{
	implicit def mapToAttributes(map: Map[String, String]): Attributes = new Attributes( map )

	implicit def nodeToOption[A <: NodeSeq](node: A): Option[A] = Option( node )

	implicit def optionStringToOptionText(option: Option[String]): Option[Text] = option.map( Text( _ ) )

	implicit def optionTupleToAttribute(attribute: (String, Option[String])): Attributes = attribute match
	{
		case (key, Some( value )) => Attributes( key -> value )
		case _ => Attributes.empty
	}

	implicit def propertyToString(property: Property): String = property.toString

	implicit def stringsToAttributes(attributes: Seq[(String, String)]): Attributes = mapToAttributes( attributes.toMap )

	implicit def stringToLabelOption(label: String): Option[Label] = Option( Template.Label( label ) )

	implicit def stringToOption(string: String): Option[String] = Some( string )

	implicit def stringTupleToAttribute( attribute: (String, String) ): Attributes = new Attributes( Map( attribute ) )

	implicit def xmlToHtml(element: NodeSeq): Html = Html( element.toString )
}