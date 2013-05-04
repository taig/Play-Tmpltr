package com.taig.bootstrapper

import scala.xml._

abstract class HtmlNode[N](label: String, minimizeEmpty: Boolean, child: NodeSeq, val attrs: Attributes) extends Elem(
	null, label, Null, TopScope, minimizeEmpty, child: _*
)
{
	def this(element: Elem, attributes: Attributes = Attributes.empty) = this(
		element.label, element.minimizeEmpty, element.child, attributes ++ element.attributes.asAttrMap
	)

	def %(attributes: Attributes): N

	override def toString =
	{
		"<" + label + attrs + ( if( child.isEmpty && minimizeEmpty ) " />"
		else
		{
			">" + child.mkString + "</" + label + ">"
		} )
	}
}