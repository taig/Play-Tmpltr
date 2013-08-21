package engine.bootstrap

import com.taig.tmpltr._
import com.taig.tmpltr.{ markup, Attributes }

import play.api.templates.Html

class	callout( attributes: Attributes )( content: Html )
extends	markup.div[callout]( attributes )( content )
{
	def this( `type`: callout.`type`, title: Option[String], attributes: Attributes )( content: Html ) =
	{
		this( attributes ++ Attributes( "class" -> Seq[Option[_]]( "bs-callout", `type` ) ) )
		{
			title.fold( content )( title => Html( "<h4>" + title + "</h4>" ) += content )
		}
	}

	protected def copy = new callout( _: Attributes )( content )
}

object	callout
extends	property.callout
{
	def apply( `type`: callout.`type`, title: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Html ) : callout =
	{
		new callout( `type`, title, attributes )( content )
	}
}