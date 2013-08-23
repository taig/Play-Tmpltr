package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	i[A <: i[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "i", content, attributes )