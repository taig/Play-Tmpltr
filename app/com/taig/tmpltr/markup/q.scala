package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	q[A <: q[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "q", content, attributes )