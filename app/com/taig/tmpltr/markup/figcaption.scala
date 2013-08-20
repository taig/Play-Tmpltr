package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	figcaption[A <: figcaption[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "figcaption", attributes, content )