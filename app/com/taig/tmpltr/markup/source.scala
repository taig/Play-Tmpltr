package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	source[A <: source[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "source", attributes, content )