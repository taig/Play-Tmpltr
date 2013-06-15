package com.taig

import play.api.templates.{Txt, Html}
import play.api.mvc.Call

package object tmpltr
{
	implicit def callToOptionString( call: Call ): Option[String] = call.toString

	implicit def htmlNodeToHtml( node: HtmlNode[_] ): Html = Html( node.toString )

	implicit def htmlToOptionString( html: Html ): Option[String] = Some( html.body.trim )

	implicit def htmlToAttributesHtmlTuple( html: Html ): ( Attributes, Html ) = ( Attributes.empty, html )

	implicit def htmlToTxt( html: Html ): Txt = Txt( html.body.trim )

	implicit def mapToAttributes( map: Map[String, String] ): Attributes = new Attributes( map )

	implicit def optionSequenceToOptionString( sequence: Seq[Option[Any]] ): Option[String] = Some( sequence.flatten.mkString( " " ) )

	implicit def optionPropertyToOptionString( property: Option[Property] ): Option[String] = property.map( _.toString )

	implicit def propertyOptionTupleToAttribute( attribute: (String, Option[Property]) ): Attributes = attribute match
	{
		case (key, Some( value )) => Attributes( key -> value.toString )
		case _ => Attributes.empty
	}

	implicit def propertyToOption[P <: Property](property: P): Option[P] = Some( property )

	implicit def stringsToAttributes( attributes: Seq[(String, String )]): Attributes = new Attributes( attributes.toMap )

	implicit def stringToHtml(string: String): Html = Html( string )

	implicit def stringToOption(string: String): Option[String] = Some( string )

	implicit def stringToTxt(string: String): Txt = Txt( string )

	implicit def tuple1ToAttributes( t: (String, String) ): Attributes = Attributes( t._1 -> Some( t._2 ) )

	implicit def tuple2ToAttributes( t: ((String, String), (String, String)) ): Attributes = new Attributes( Map( t._1, t._2 ) )

	implicit def tuple3ToAttributes( t: ((String, String), (String, String), (String, String)) ): Attributes = new Attributes( Map( t._1, t._2, t._3 ) )

	implicit def tuple4ToAttributes( t: ((String, String), (String, String), (String, String), (String, String)) ): Attributes = new Attributes( Map( t._1, t._2, t._3, t._4 ) )

	implicit def tuple5ToAttributes( t: ((String, String), (String, String), (String, String), (String, String), (String, String)) ): Attributes = new Attributes( Map( t._1, t._2, t._3, t._4, t._5 ) )

	implicit def tuple5ToAttributes( t: ((String, String), (String, String), (String, String), (String, String), (String, String), (String, String)) ): Attributes = new Attributes( Map( t._1, t._2, t._3, t._4, t._5, t._6 ) )
}