package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	bdo[A <: bdo[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "bdo", content, attributes )