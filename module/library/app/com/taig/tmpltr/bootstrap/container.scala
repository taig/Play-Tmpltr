package com.taig.tmpltr.bootstrap

import com.taig.tmpltr._
import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class container(attributes: Attributes)(content: Html) extends Tag.Html.Body.Division[container](
	attributes ++ ( "class" -> "container" )
)( content )
{
	protected def copy = new container( _: Attributes )( content )
}

object container
{
	def apply(attributes: (String, String)*)(content: Html): container = new container( attributes )( content )

	def apply(content: Html): container = apply( )( content )
}