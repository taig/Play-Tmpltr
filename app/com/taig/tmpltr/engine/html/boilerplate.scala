package com.taig.tmpltr.engine.html

import com.taig.tmpltr.Attributes

import play.api.templates.Html

import scala.xml.NodeSeq

class	boilerplate( head: (Attributes, Html), body: (Attributes, Html), attributes: Attributes )
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
	def apply( attributesHtml: Attributes )( head: Html, attributesHead: Attributes = Attributes.empty )( body: Html, attributesBody: Attributes = Attributes.empty ): boilerplate =
	{
		new boilerplate( (attributesHead, head), (attributesBody, body), attributesHtml )
	}

	def apply( head: Html, attributesHead: Attributes )( body: Html, attributesBody: Attributes ): boilerplate =
	{
		apply( Attributes.empty )( head, attributesHead )( body, attributesBody )
	}

	def apply( head: Html )( body: Html ): boilerplate =
	{
		apply( head, Attributes.empty )( body, Attributes.empty )
	}
}