package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	colgroup[A <: colgroup[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "colgroup", content, attributes )