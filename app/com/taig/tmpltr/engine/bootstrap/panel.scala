package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._

import play.api.mvc.Content

class	panel( header: Option[panel.header], body: panel.body, footer: Option[panel.footer], attributes: Attributes )
extends	markup.div[panel]( attributes ~ ( "class" -> "panel" ) )( header.getOrElse( Tag.empty ) += body += footer.getOrElse[Tag[_]]( Tag.empty ) )
{
	protected def copy = new panel( header, body, footer, _: Attributes )
}

object panel
{
	def apply( body: panel.body, header: Option[panel.header] = None, footer: Option[panel.footer] = None, attributes: Attributes = Attributes.empty ) =
	{
		new panel( header, body, footer, attributes )
	}

	class	body( attributes: Attributes )( content: Content )
	extends	markup.div[body]( attributes ~ ( "class" -> "panel-body" ) )( content )
	with	Helper.Default[body]
	{
		protected val helper = com.taig.tmpltr.engine.bootstrap.panel.body
	}

	object	body
	extends	Helper.DefaultCompanion[body]
	{
		def apply( attributes: Attributes )( content: Content ) = new body( attributes: Attributes )( content )
	}

	class	footer( attributes: Attributes )( content: Content )
	extends	markup.div[footer]( attributes ~ ( "class" -> "panel-footer" ) )( content )
	with	Helper.Default[footer]
	{
		protected val helper = footer
	}

	object	footer
	extends	Helper.DefaultCompanion[footer]
	{
		def apply( attributes: Attributes )( content: Content ) = new footer( attributes: Attributes )( content )
	}

	class	header( attributes: Attributes )( content: Content )
	extends	markup.div[header]( attributes ~ ( "class" -> "panel-heading" ) )( content )
	with	Helper.Default[header]
	{
		protected val helper = header
	}

	object	header
	extends	Helper.DefaultCompanion[header]
	{
		def apply( attributes: Attributes )( content: Content ) = new header( attributes: Attributes )( content )

		class title( level: Integer, attributes: Attributes )( content: Content )
		extends	markup.h[title]( level, attributes ~ ( "class" -> "panel-title" ) )( content )
		{
			protected def copy = new title( level, _: Attributes )( content )
		}
	}
}