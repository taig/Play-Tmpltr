package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	s[A <: s[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "s", content, attributes )