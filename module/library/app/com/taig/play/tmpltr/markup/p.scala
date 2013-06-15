package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	p[A <: p[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "p", attributes, content )