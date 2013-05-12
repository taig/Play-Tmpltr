package com.taig.tmpltr.markup

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes
import scala.xml.NodeSeq
import play.api.templates.Html

class boilerplate(head: (Attributes, Html), body: (Attributes, Html)) extends NodeSeq
{
	val theSeq = Seq( new markup.head( head._1 )( head._2 ), new markup.body( body._1 )( body._2 ) )
}

object boilerplate
{
	def apply(head: (Attributes, Html))(body: (Attributes, Html)): boilerplate = new boilerplate( head, body )
}