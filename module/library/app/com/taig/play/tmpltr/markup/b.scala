package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	b[A <: b[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "b", attributes, content )