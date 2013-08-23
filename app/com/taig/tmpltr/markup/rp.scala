package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	rp[A <: rp[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "rp", content, attributes )