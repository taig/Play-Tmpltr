package com.taig.tmpltr.bootstrap

import com.taig.tmpltr._
import com.taig.tmpltr.markup.a
import com.taig.tmpltr.markup.a.Target
import com.taig.tmpltr.bootstrap.element.Button
import play.api.templates.Html

object a
{
	class button(href: Option[String], target: Option[Target], style: Option[button.Style], size: Option[button.Size], attributes: Attributes)(content: Html) extends a(
		href, target, attributes ++ ( "class" -> ( "btn " + style.getOrElse("") + " " + size.getOrElse("") ) )
	)( content )

	object button extends Button
	{
		def apply(href: Option[String], target: Option[Target], style: Style, size: Size, attributes: (String, String)*)(content: Html): button =
		{
			new button( href, target, style, size, attributes )( content )
		}

		def apply(href: Option[String], target: Option[Target], style: Style, attributes: (String, String)*)(content: Html): button =
		{
			apply( href, target, style, Size.Default, attributes: _* )( content )
		}

		def apply(href: Option[String], target: Option[Target], size: Size, attributes: (String, String)*)(content: Html): button =
		{
			apply( href, target, Style.Default, size, attributes: _* )( content )
		}

		def apply(href: Option[String], target: Option[Target], attributes: (String, String)*)(content: Html): button =
		{
			apply( href, target, Style.Default, Size.Default, attributes: _* )( content )
		}

		def apply(href: Option[String], style: Style, size: Size, attributes: (String, String)*)(content: Html): button =
		{
			apply( href, None, style, size, attributes: _* )( content )
		}

		def apply(href: Option[String], style: Style, attributes: (String, String)*)(content: Html): button =
		{
			apply( href, None, style, Size.Default, attributes: _* )( content )
		}

		def apply(href: Option[String], size: Size, attributes: (String, String)*)(content: Html): button =
		{
			apply( href, None, Style.Default, size, attributes: _* )( content )
		}

		def apply(href: Option[String], attributes: (String, String)*)(content: Html): button =
		{
			apply( href, None, Style.Default, Size.Default, attributes: _* )( content )
		}
	}
}