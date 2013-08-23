package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	tr[A <: tr[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "tr", content, attributes )