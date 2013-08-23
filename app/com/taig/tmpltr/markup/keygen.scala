package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	keygen[A <: keygen[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "keygen", content, attributes )