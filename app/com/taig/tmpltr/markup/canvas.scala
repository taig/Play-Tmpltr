package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	canvas[A <: canvas[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "canvas", content, attributes )