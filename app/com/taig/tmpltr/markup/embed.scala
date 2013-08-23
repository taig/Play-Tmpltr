package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	embed[A <: embed[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "embed", content, attributes )