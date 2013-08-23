package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	b[A <: b[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "b", content, attributes )