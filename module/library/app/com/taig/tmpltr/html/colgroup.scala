package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class colgroup(attributes: Attributes)(content: Html) extends Tag.Html.Body.Table.Columns[colgroup]( attributes )( content )
{
	protected def copy = new colgroup( _: Attributes )( content )
}

object colgroup
{
	def apply(attributes: (String, String)*)(content: Html): colgroup = new colgroup( attributes )( content )

	def apply(content: Html): colgroup = apply( )( content )
}