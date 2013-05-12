package com.taig.tmpltr

import scala.xml.{Elem, NodeSeq, Null, TopScope}

abstract class HtmlNode[N](label: String, minimizeEmpty: Boolean, child: NodeSeq, val attrs: Attributes) extends Elem(
	null, label, Null, TopScope, minimizeEmpty, child: _*
)
{
	def this(element: Elem, attributes: Attributes = Attributes.empty) = this(
		element.label, element.minimizeEmpty, element.child, new Attributes( attributes ++ element.attributes.asAttrMap )
	)

	def %(attributes: Attributes): N = copy( new Attributes( attrs ++ attributes ) )

	protected def copy: Attributes => N

	override def toString: String =
	{
		"<" + label + attrs + ( if( child.isEmpty && minimizeEmpty ) " />"
		else
		{
			">" + child.mkString + "</" + label + ">"
		} )
	}
}