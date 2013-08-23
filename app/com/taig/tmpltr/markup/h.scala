package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	h[A <: h[A]]( level: Int, attributes: Attributes )( content: Content )
extends			Tag[A]( "h" + level, content, attributes )
{
	require( level >= 1 && level <= 6 )
}