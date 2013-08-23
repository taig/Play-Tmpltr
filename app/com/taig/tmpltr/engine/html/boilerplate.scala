package com.taig.tmpltr.engine.html

import com.taig.tmpltr.Attributes

import play.api.mvc.Content
import play.api.templates.Html
import scala.xml.NodeSeq

class	boilerplate( head: (Attributes, Content), body: (Attributes, Content), attributes: Attributes )
extends NodeSeq
{
	val theSeq = null

	override def toString =
		doctype() + "\n" +
		new html( attributes )( Html(
			new head( head._1 )( head._2 ) + "\n" +
			new body( body._1 )( body._2 ) ) )
}

object boilerplate
{
	def apply( attributesContent: Attributes )( head: Content, attributesHead: Attributes = Attributes.empty )( body: Content, attributesBody: Attributes = Attributes.empty ): boilerplate =
	{
		new boilerplate( (attributesHead, head), (attributesBody, body), attributesContent )
	}

	def apply( head: Content, attributesHead: Attributes )( body: Content, attributesBody: Attributes ): boilerplate =
	{
		apply( Attributes.empty )( head, attributesHead )( body, attributesBody )
	}

	def apply( head: Content )( body: Content ): boilerplate =
	{
		apply( head, Attributes.empty )( body, Attributes.empty )
	}
}