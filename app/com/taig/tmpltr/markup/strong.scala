package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	strong[A <: strong[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "strong", content, attributes )