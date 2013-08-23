package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

class	meta( attributes: Attributes )
extends	markup.meta[meta]( attributes )
{
	protected def copy = new meta( _: Attributes )
}

object meta
{
	def apply( attributes: Attributes ): meta = new meta( attributes )
	
	class	content( name: Option[String], content: Option[String], attributes: Attributes )
	extends	meta( attributes ~~ ( ( "name" -> name, "content" -> content ) ) )
	
	object content
	{
		def apply( name: Option[String] = None, content: Option[String] = None, attributes: Attributes = Attributes.empty ) =
		{
			new content( name, content, attributes )
		}
	}
	
	class	charset( charset: Option[String], attributes: Attributes )
	extends	meta( attributes ~ ( "charset" -> charset ) )

	object charset
	{
		def apply( charset: Option[String], attributes: Attributes = Attributes.empty ) =
		{
			new charset( charset, attributes )
		}
	}
}