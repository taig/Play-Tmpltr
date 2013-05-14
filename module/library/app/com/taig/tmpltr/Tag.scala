package com.taig.tmpltr

import play.api.mvc.Content

import scala.xml.{ NodeSeq, Unparsed }

abstract class	Tag[T <: Tag[T]] protected( tag: String, attributes: Attributes = Attributes.empty, content: Option[Content] = None, minimizeEmpty: Boolean = true )
extends			HtmlNode[T]( tag, minimizeEmpty, content.fold( NodeSeq.Empty )( content => Unparsed( content.body.trim ) ), attributes )
{
	protected def this( tag: String, attributes: Attributes, content: Content, minimizeEmpty: Boolean ) =
	{
		this( tag, attributes, Some( content ), minimizeEmpty )
	}

	protected def this( tag: String, attributes: Attributes, content: Content ) =
	{
		this( tag, attributes, Some( content ) )
	}
}