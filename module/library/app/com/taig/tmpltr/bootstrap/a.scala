package com.taig.tmpltr.bootstrap

import com.taig.tmpltr._
import com.taig.tmpltr.markup.a
import com.taig.tmpltr.markup.a.Target
import com.taig.tmpltr.bootstrap.element.Button
import play.api.templates.Html

object a
{
	class button(href: Option[String], target: Option[Target], `type`: Option[button.Type], size: Option[button.Size], attributes: Attributes)(content: Html) extends a(
		href, target, attributes ++ ( "class" -> ( "btn " + `type`.getOrElse("") + " " + size.getOrElse("") ) )
	)( content )

	object button extends Button
	{
		def apply(href: Option[String], target: Option[Target], `type`: Type, size: Size, attributes: (String, String)*)(content: Html): button =
		{
			new button( href, target, `type`, size, attributes )( content )
		}

		def apply(href: Option[String], target: Option[Target], `type`: Type, attributes: (String, String)*)(content: Html): button =
		{
			apply( href, target, `type`, Size.Default, attributes: _* )( content )
		}

		def apply(href: Option[String], target: Option[Target], size: Size, attributes: (String, String)*)(content: Html): button =
		{
			apply( href, target, Type.Default, size, attributes: _* )( content )
		}

		def apply(href: Option[String], target: Option[Target], attributes: (String, String)*)(content: Html): button =
		{
			apply( href, target, Type.Default, Size.Default, attributes: _* )( content )
		}

		def apply(href: Option[String], `type`: Type, size: Size, attributes: (String, String)*)(content: Html): button =
		{
			apply( href, None, `type`, size, attributes: _* )( content )
		}

		def apply(href: Option[String], `type`: Type, attributes: (String, String)*)(content: Html): button =
		{
			apply( href, None, `type`, Size.Default, attributes: _* )( content )
		}

		def apply(href: Option[String], size: Size, attributes: (String, String)*)(content: Html): button =
		{
			apply( href, None, Type.Default, size, attributes: _* )( content )
		}

		def apply(href: Option[String], attributes: (String, String)*)(content: Html): button =
		{
			apply( href, None, Type.Default, Size.Default, attributes: _* )( content )
		}
	}
}