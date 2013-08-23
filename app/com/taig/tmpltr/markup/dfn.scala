package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	dfn[A <: dfn[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "dfn", content, attributes )