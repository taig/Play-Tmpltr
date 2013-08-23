package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	obj[A <: obj[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "object", content, attributes )