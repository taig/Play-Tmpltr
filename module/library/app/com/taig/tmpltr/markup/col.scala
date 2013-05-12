package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}

class col(attributes: Attributes) extends Tag.Html.Body.Table.Columns.Column[col]( attributes )
{
	protected def copy = new col( _: Attributes )
}

object col
{
	def apply(attributes: (String, String)*): col = new col( attributes )
}