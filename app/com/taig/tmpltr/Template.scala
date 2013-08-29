package com.taig.tmpltr

import play.templates.{BaseScalaTemplate, Format, Appendable}
import scala.reflect.ClassTag

class	Template[T <: Appendable[T], F <: Format[T]]( override val format: F )
extends	BaseScalaTemplate[T, F]( format )
{
	override def _display_( any: Any )( implicit tag: ClassTag[T] ): T = any match
	{
		case tag: Tag[_] if tag != null => format.raw( tag.toString )
		case _ => super._display_( any )( tag )
	}
}