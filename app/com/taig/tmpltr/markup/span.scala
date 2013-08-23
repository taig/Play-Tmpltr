package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	span[A <: span[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "span", content, attributes )