package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	p[A <: p[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "p", content, attributes )