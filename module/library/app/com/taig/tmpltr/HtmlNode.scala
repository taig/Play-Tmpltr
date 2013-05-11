package com.taig.tmpltr

import scala.xml.{Elem, NodeSeq, Null, TopScope}

abstract class HtmlNode[N](label: String, minimizeEmpty: Boolean, child: NodeSeq, val attrs: Attributes) extends Elem(
	null, label, Null, TopScope, minimizeEmpty, child: _*
)
{
	def this(element: Elem, attributes: Attributes = Attributes.empty) = this(
		element.label, element.minimizeEmpty, element.child, new Attributes( attributes ++ element.attributes.asAttrMap )
	)

	def %(attributes: Attributes): N

	protected def %( builder: Attributes => N, attributes: Attributes ): N = builder( new Attributes( attrs ++ attributes ) )

	override def toString: String =
	{
		"<" + label + attrs + ( if( child.isEmpty && minimizeEmpty ) " />"
		else
		{
			">" + child.mkString + "</" + label + ">"
		} )
	}
}