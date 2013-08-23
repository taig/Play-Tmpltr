package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	table[A <: table[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "table", content, attributes )