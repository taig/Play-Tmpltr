package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	map[A <: map[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "map", attributes, content )