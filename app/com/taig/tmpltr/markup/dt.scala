package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	dt[A <: dt[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "dt", content, attributes )