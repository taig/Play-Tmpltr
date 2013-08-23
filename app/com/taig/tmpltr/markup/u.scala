package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	u[A <: u[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "u", content, attributes )