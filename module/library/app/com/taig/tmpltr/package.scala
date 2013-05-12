package com.taig

import play.api.templates.Html

package object tmpltr
{
	implicit def htmlToOptionString(html: Html): Option[String] = Some( html.body.trim )

	implicit def mapToAttributes(map: Map[String, String]): Attributes = new Attributes( map )

	implicit def optionPropertyToOptionString(property: Option[Property]): Option[String] = property.map( _.toString )

	implicit def propertyOptionTupleToAttribute(attribute: (String, Option[Property])): Attributes = attribute match
	{
		case (key, Some( value )) => Attributes( key -> value.toString )
		case _ => Attributes.empty
	}

	implicit def propertyToOption[P <: Property](property: P): Option[P] = Some( property )

	implicit def stringsToAttributes(attributes: Seq[(String, String)]): Attributes = mapToAttributes( attributes.toMap )

	implicit def stringToHtml(string: String): Html = Html( string )

	implicit def stringToOption(string: String): Option[String] = Some( string )

	implicit def stringTupleToAttributes(tuple: (String, String)): Attributes = Attributes( tuple._1 -> Some( tuple._2 ) )

	implicit def stringTupleToOption(tuple: (String, String)): Option[(String, String)] = Some( tuple )
}