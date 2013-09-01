package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._
import com.taig.tmpltr.engine.html

import play.api.mvc.Content

class	panel private( attributes: Attributes, content: Content )
extends	html.div( attributes ~ ( "class" -> "panel" ), content )
with	Tag.Body[panel, Content]
{
	def this( body: panel.body, header: Option[panel.header], footer: Option[panel.footer], attributes: Attributes ) =
	{
		this( attributes, header += body += footer )
	}
}

object	panel
{
	class	body( attributes: Attributes, content: Content )
	extends	html.div( attributes ~ ( "class" -> "panel-body" ), content )
	with	Tag.Body[body, Content]

	object	body
	extends	Tag.Body.Appliable[body, Content]

	class	footer( attributes: Attributes, content: Content )
	extends	html.div( attributes ~ ( "class" -> "panel-footer" ), content )
	with	Tag.Body[footer, Content]

	object	footer
	extends	Tag.Body.Appliable[footer, Content]

	class	header( attributes: Attributes, content: Content )
	extends	html.div( attributes ~ ( "class" -> "panel-heading" ), content )
	with	Tag.Body[header, Content]

	object	header
	extends	Tag.Body.Appliable[header, Content]
}