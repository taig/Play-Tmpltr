package com.taig.tmpltr.markup

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes
import scala.xml.NodeSeq
import play.api.templates.Html

class boilerplate(head: (Attributes, Html), body: (Attributes, Html), attributes: Attributes) extends NodeSeq
{
	val theSeq = Seq(
		new html( attributes )(
			Html( new markup.head( head._1 )( head._2 ) + "\n" + new markup.body( body._1 )( body._2 ) )
		)
	)
}

object boilerplate
{
	def apply(head: (Attributes, Html))(body: (Attributes, Html), attributes: (String, String)*): boilerplate =
	{
		new boilerplate( head, body, attributes )
	}
}