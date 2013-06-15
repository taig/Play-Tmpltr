package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	q[A <: q[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "q", attributes, content )