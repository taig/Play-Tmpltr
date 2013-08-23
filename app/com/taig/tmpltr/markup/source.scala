package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	source[A <: source[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "source", content, attributes )