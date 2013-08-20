package com.taig.tmpltr.engine.bootstrap.property

import com.taig.tmpltr._
import com.taig.tmpltr.Property

trait icon
{
	class image( image: String ) extends Property( "glyphicon" -> "-", image )
}