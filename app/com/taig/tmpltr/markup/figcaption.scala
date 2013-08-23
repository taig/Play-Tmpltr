package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	figcaption[A <: figcaption[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "figcaption", content, attributes )