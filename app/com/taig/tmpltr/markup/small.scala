package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	small[A <: small[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "small", content, attributes )