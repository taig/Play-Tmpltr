package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	dd[A <: dd[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "dd", content, attributes )