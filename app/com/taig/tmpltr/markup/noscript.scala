package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	noscript[A <: noscript[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "noscript", content, attributes )