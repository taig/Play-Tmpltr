package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	u[A <: u[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "u", attributes, content )