package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	ins[A <: ins[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "ins", content, attributes )