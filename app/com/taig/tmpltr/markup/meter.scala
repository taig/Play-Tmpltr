package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	meter[A <: meter[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "meter", content, attributes )