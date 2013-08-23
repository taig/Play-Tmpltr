package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	output[A <: output[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "output", content, attributes )