package com.taig.tmpltr

import play.api.templates.Html

package object html
{
	implicit def htmlToOptionString(html: Html): Option[String] = Some( html.body.trim )

	implicit def mapToAttributes(map: Map[String, String]): Attributes = new Attributes( map )

	implicit def optionPropertyToOptionString(property: Option[Property]): Option[String] = property.map( _.identifier )

	implicit def optionTupleToAttribute[T](attribute: (String, Option[Property])): Attributes = attribute match
	{
		case (key, Some( value )) => Attributes( key -> value.identifier )
		case _ => Attributes.empty
	}

	implicit def propertyToOption[P <: Property]( property: P ): Option[P] = Some( property )

	implicit def stringsToAttributes(attributes: Seq[(String, String)]): Attributes = mapToAttributes( attributes.toMap )

	implicit def stringToHtml(string: String): Html = Html( string )

	implicit def stringToOption(string: String): Option[String] = Some( string )
}