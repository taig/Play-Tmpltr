package engine.bootstrap

import com.taig.tmpltr._

import play.api.mvc.Content

class	callout( `type`: callout.`type`, attributes: Attributes )( content: Content )
extends	markup.div[callout]( attributes ~ ( "class" -> ("bs-callout", `type`) ) )( content )
{
	protected def copy = new callout( `type`, _: Attributes )( content )
}

object	callout
extends	property.callout
{
	def apply( `type`: `type`, attributes: Attributes = Attributes.empty )( content: Content ) : callout =
	{
		new callout( `type`, attributes )( content )
	}
}