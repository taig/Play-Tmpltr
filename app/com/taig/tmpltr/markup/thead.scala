package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	thead[A <: thead[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "thead", content, attributes )