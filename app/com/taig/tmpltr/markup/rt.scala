package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	rt[A <: rt[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "rt", content, attributes )