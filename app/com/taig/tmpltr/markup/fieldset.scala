package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	fieldset[A <: fieldset[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "fieldset", content, attributes )