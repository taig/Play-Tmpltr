package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	em[A <: em[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "em", content, attributes )