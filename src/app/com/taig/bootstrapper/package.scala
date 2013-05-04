package com.taig

import play.api.templates.Html
import scala.xml.{NodeSeq, Text}
import play.api.mvc.Call

package object bootstrapper
{
	implicit def identifierToOption(identifier: String): Option[String] = Some( identifier )

	implicit def xmlToHtml(element: NodeSeq): Html = Html( element.toString )

	implicit def elementToOption[A <: NodeSeq](element: A): Option[A] = Option( element )

	implicit def stringToLabelOption(label: String): Option[Label] = Option( Template.Label( label ) )

	implicit def mapToArguments(map: Map[String, String]): Attributes = new Attributes( map )

	implicit def stringsToArguments(arguments: Seq[(String, String)]): Attributes = mapToArguments( arguments.toMap )

	implicit def tupleToArguments(argument: (String, String)): Attributes = Attributes( argument._1 -> argument._2 )

	implicit def optionStringToOptionText(option: Option[String]): Option[Text] = option.map( Text( _ ) )

	implicit def propertyToString(property: Property): String = property.toString

	implicit def urlToString(url: Call): String = url.toString
}
