package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	map[A <: map[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "map", content, attributes )