package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	h[A <: h[A]]( level: Integer, attributes: Attributes )( content: Html )
extends			Tag[A]( "h" + level, attributes, content )
{
	require( level >= 1 && level <= 6 )
}