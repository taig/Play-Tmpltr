package com.taig.tmpltr.markup

import com.taig.tmpltr.Tag
import com.taig.tmpltr.{Property, Attributes}
import play.api.templates.Html
import com.taig.tmpltr.markup.a.Target

class doctype extends Tag.Doctype[doctype]( "html" )
{
	protected def copy = (attributes: Attributes) => new doctype
}

object doctype
{
	def apply = new doctype
}