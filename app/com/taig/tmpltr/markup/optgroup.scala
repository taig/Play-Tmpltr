package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	optgroup[A <: optgroup[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "optgroup", content, attributes )