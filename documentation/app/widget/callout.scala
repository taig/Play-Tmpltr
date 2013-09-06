package widget

import com.taig.tmpltr._
import com.taig.tmpltr.engine.html

import play.api.mvc.Content

class	callout /*private*/( attributes: Attributes, content: Content )
extends	html.div( attributes, content )
with	Tag.Body[callout, Content]
{
	def this( `type`: callout.`type`, attributes: Attributes, content: Content ) =
	{
		this( attributes ~ ( "class" -> ( "bs-callout", `type` ) ), content )
	}
}

object	callout
extends	property.callout
{
	def apply( `type`: `type`, attributes: Attributes = Attributes.empty )( content: Content ) =
	{
		new callout( `type`, attributes, content )
	}
}