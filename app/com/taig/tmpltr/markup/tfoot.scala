package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	tfoot[A <: tfoot[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "tfoot", content, attributes )